package com.freshbooks.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import com.freshbooks.ApiConnection;
import com.freshbooks.ApiException;
import com.freshbooks.CustomXStream;
import com.freshbooks.model.Request;
import com.freshbooks.model.Response;
import com.thoughtworks.xstream.XStream;

@SuppressWarnings("unchecked")
public class MockApiConnection extends ApiConnection {

    Iterator<Object> expectedRequests = Collections.EMPTY_LIST.iterator();
    Iterator<Object> plannedResponses = Collections.EMPTY_LIST.iterator();
    XStream xs = new CustomXStream();
    
    public Iterator<Object> getExpectedRequests() {
        return expectedRequests;
    }
    public void setExpectedRequests(Iterator<Object> expectation) {
        this.expectedRequests = expectation;
    }
    public void setExpectedRequests(Collection<Object> expectation) {
        this.expectedRequests = expectation.iterator();
    }
    public void setExpectedRequests(Object ... expectation) {
        this.expectedRequests = Arrays.asList(expectation).iterator();
    }
    public Iterator<Object> getPlannedResponses() {
        return plannedResponses;
    }
    public void setPlannedResponses(Iterator<Object> results) {
        this.plannedResponses = results;
    }
    public void setPlannedResponses(Collection<Object> results) {
        this.plannedResponses = results.iterator();
    }
    public void setPlannedResponses(Object ... responses) {
        this.plannedResponses = Arrays.asList(responses).iterator();
    }
    
    String readAll(InputStream stream) throws IOException {
        byte[] buf = new byte[10000];
        StringBuffer sb = new StringBuffer();
        while(stream.read(buf) > 0) {
            try {
                sb.append(new String(buf, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        return sb.toString();
    }
    @Override
    protected Response performRequest(Request request) throws ApiException, IOException {
        if(!expectedRequests.hasNext())
            fail("Got more requests than expected");
        Object expectedRequest = expectedRequests.next();
        String requestXml = xs.toXML(request);
        if(expectedRequest instanceof Request)
            expectedRequest = xs.toXML(expectedRequest);
        if(expectedRequest instanceof URL)
            expectedRequest = ((URL)expectedRequest).openStream();
        if(expectedRequest instanceof InputStream)
            expectedRequest = readAll((InputStream)expectedRequest);
        if(expectedRequest instanceof String)
            assertEquals((String)expectedRequest, requestXml);
        else if(expectedRequest instanceof Comparable)
            assertTrue(((Comparable<Object>)expectedRequest).compareTo(request) == 0);
        else
            fail("Bad request expectation: "+expectedRequest);
        if(!plannedResponses.hasNext())
            fail("Response iterator ran out of responses before the requests iterator.");
        Object plannedResponse = plannedResponses.next();
        if(plannedResponse instanceof String)
            return (Response) xs.fromXML((String)plannedResponse);
        if(plannedResponse instanceof URL)
            plannedResponse = ((URL)plannedResponse).openStream();
        if(plannedResponse instanceof InputStream)
            return (Response) xs.fromXML((InputStream)plannedResponse);
        if(plannedResponse instanceof Response)
            return (Response) plannedResponse;
        fail("Bad response object: "+plannedResponse);
        return null;
    }
}
