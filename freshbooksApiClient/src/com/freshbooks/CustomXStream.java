package com.freshbooks;


import com.freshbooks.model.Client;
import com.freshbooks.model.Clients;
import com.freshbooks.model.Invoice;
import com.freshbooks.model.InvoiceLine;
import com.freshbooks.model.Request;
import com.freshbooks.model.Response;
import com.freshbooks.model.ResponseStatus;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.thoughtworks.xstream.mapper.CannotResolveClassException;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class CustomXStream extends XStream {
    public CustomXStream() {
        super(null, new XppDriver(new XmlFriendlyReplacer("::", "_")));
        registerConverter(new DateConverter("yyyy-MM-dd", new String[0]));
        processAnnotations(new Class[] {
            Request.class,
            Response.class,
            ResponseStatus.class,
            Invoice.class,
            InvoiceLine.class,
            Client.class,
            Clients.class
        });
    }
    
    /**
     * Allow and ignore unexpected xml tags
     */  
    protected MapperWrapper wrapMapper(MapperWrapper next) {
        return new MapperWrapper(next) {
            @SuppressWarnings("unchecked")
            public boolean shouldSerializeMember(Class definedIn, String fieldName) {
                //System.out.println("shouldSerializeMember("+definedIn.getName()+", "+fieldName+") implicitCollection = "+getImplicitCollectionDefForFieldName(definedIn, fieldName));
                try {
                    return definedIn != Object.class || realClass(fieldName) != null;
                } catch(CannotResolveClassException cnrce) {
                    //System.out.println("shouldSerializeMember("+definedIn.getName()+", "+fieldName+") failed to resolve class; skipping...");
                    return false;
                }
            }
        };
    }
    
    
}
