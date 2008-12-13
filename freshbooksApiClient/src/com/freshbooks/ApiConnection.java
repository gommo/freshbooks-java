package com.freshbooks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.freshbooks.model.Invoice;
import com.freshbooks.model.Invoices;
import com.freshbooks.model.PagedResponseContent;
import com.freshbooks.model.Request;
import com.freshbooks.model.RequestMethod;
import com.freshbooks.model.Response;
import com.thoughtworks.xstream.XStream;

public class ApiConnection {
    static final Logger logger = LoggerFactory.getLogger(ApiConnection.class);

    URL apiUrl;
    String key;
    String userAgent;
    HttpClient client;
    String base64key;
    boolean debug;
    
    public ApiConnection(URL apiUrl, String key, String userAgent) {
        this.apiUrl = apiUrl;
        this.key = key;
        this.userAgent = userAgent;
        client = new HttpClient();
        client.getParams().setAuthenticationPreemptive(true);
        client.getState().setCredentials(new AuthScope(apiUrl.getHost(), 443, AuthScope.ANY_REALM), new UsernamePasswordCredentials(key, ""));
        base64key = new String(Base64.encodeBase64((key+":X").getBytes()));
    }

    /**
     * Send a request to the FreshBooks API and return the response object.
     * @param url
     * @param postObject
     * @return
     * @throws IOException 
     * @throws Error
     */
    private Response performRequest(Request request) throws ApiException, IOException {
        try {
            XStream xs = new CustomXStream();
            
            String paramString = xs.toXML(request);
            PostMethod method = new PostMethod(apiUrl.toString());
            try {
                method.setContentChunked(false);
                method.setDoAuthentication(true);
                method.setFollowRedirects(false);
                method.addRequestHeader("User-Agent", userAgent);
                //method.addRequestHeader("Authorization", base64key);
                method.setRequestEntity(new StringRequestEntity(paramString, "text/xml", "utf-8"));
                client.executeMethod(method);
                if(debug) {
                    logger.debug("POST "+apiUrl+" "+paramString+" yields: "+method.getResponseBodyAsString());
                }
                InputStream is = method.getResponseBodyAsStream();
                try {
                    Response response = (Response)xs.fromXML(new BufferedReader(new InputStreamReader(is, "utf8")));
                    // TODO Throw an error if we got one
                    if(response.isFail()) {
                        throw new ApiException(response.getError());
                    }
                    return response;
                } finally {
                    if(is != null) is.close();
                }
            } finally {
                method.releaseConnection();
            }
        } catch (MalformedURLException e) {
            throw new Error(e);
        }
    }
    
    /**
     * Create an invoice using the given information and return its id.
     * @throws ApiException If an error is returned from FreshBooks
     * @throws IOException If there is a communications error with the FreshBooks API server
     */
    public String createInvoice(Invoice invoice) throws ApiException, IOException {
        return performRequest(new Request(RequestMethod.INVOICE_CREATE, invoice)).getInvoiceId();
    }

    public URL getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(URL apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    
    public Iterable<Invoice> listInvoices(final int perPage) {
        return new Iterable<Invoice>() {
            @Override
            public Iterator<Invoice> iterator() {
                try {
                    return new InvoicesIterator(perPage);
                } catch (ApiException e) {
                    throw new Error(e);
                } catch (IOException e) {
                    throw new Error(e);
                }
            }
        };
    }
    
    abstract class RecordsIterator<T> implements Iterator<T> {
        PagedResponseContent<T> current;
        Iterator<T> currentIterator;
        final protected int perPage;
        
        public RecordsIterator(int perPage) throws ApiException, IOException {
            this.perPage = perPage;
            this.current = list(1);
            this.currentIterator = current.iterator();
        }

        protected abstract PagedResponseContent<T> list(int page) throws ApiException, IOException;

        @Override
        public boolean hasNext() {
            return currentIterator.hasNext() || current.getPage() < current.getPages();
        }
        
        @Override
        public T next() {
            if(!currentIterator.hasNext()) {
                if(current.getPage() >= current.getPages())
                    throw new NoSuchElementException();
                try {
                    current = list(current.getPage()+1);
                } catch (ApiException e) {
                    throw new NoSuchElementException(e.getLocalizedMessage());
                } catch (IOException e) {
                    throw new NoSuchElementException(e.getLocalizedMessage());
                }
                currentIterator = current.iterator();
            }
            return currentIterator.next();
        }
        
        @Override
        public void remove() {
            throw new NotImplementedException();
        }
    }
    
    class InvoicesIterator extends RecordsIterator<Invoice> {
        private InvoicesIterator(int perPage) throws ApiException, IOException {
            super(perPage);
        }

        @Override
        protected PagedResponseContent<Invoice> list(int page) throws ApiException, IOException {
            return listInvoices(page, perPage);
        }
    }
    public Invoices listInvoices(int page, int perPage) throws ApiException, IOException {
        Request request = new Request(RequestMethod.INVOICE_LIST);
        request.setPage(page);
        request.setPerPage(perPage);
        return performRequest(request).getInvoices();
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }
}
