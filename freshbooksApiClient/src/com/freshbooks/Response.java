package com.freshbooks;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("response")
public class Response extends Message {
    @XStreamAsAttribute
    ResponseStatus status;
    
    String error;
    
    public Response() {
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    
    public boolean isOk() {
        return status == ResponseStatus.ok;
    }
    
    public boolean isFail() {
        return status == ResponseStatus.fail;
    }

}
