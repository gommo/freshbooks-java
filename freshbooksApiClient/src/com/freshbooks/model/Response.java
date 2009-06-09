package com.freshbooks.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("response")
public class Response extends Message {
    @XStreamAsAttribute
    ResponseStatus status;
    
    String error;
    
    public Response() {
    }
    public Response(Clients clients) {
        status = ResponseStatus.ok;
        setClients(clients);
    }
    public Response(Invoices invoices) {
        status = ResponseStatus.ok;
        setInvoices(invoices);
    }
    public Response(Payments payments) {
        status = ResponseStatus.ok;
        setPayments(payments);
    }
    public Response(Categories categories) {
        status = ResponseStatus.ok;
        setCategories(categories);
    }
    public Response(Expenses expenses) {
        status = ResponseStatus.ok;
        setExpenses(expenses);
    }
    public Response(Items items) {
        status = ResponseStatus.ok;
        setItems(items);
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
