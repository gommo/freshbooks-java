package com.freshbooks;


public enum RequestMethod {
    CLIENT_CREATE("client.create"),
    CLIENT_UPDATE("client.update"),
    CLIENT_GET("client.get"),
    CLIENT_DELETE("client.delete"),
    CLIENT_LIST("client.list"),

    INVOICE_CREATE("invoice.create"),
    INVOICE_UPDATE("invoice.update"),
    INVOICE_GET("invoice.get"),
    INVOICE_DELETE("invoice.delete"),
    INVOICE_LIST("invoice.list"),
    
    PAYMENT_CREATE("payment.create"),
    PAYMENT_UPDATE("payment.update"),
    PAYMENT_GET("payment.get"),
    PAYMENT_DELETE("payment.delete"),
    PAYMENT_LIST("payment.list");
    
    final String id;

    private RequestMethod(String id) {
        this.id = id;
    }
    
    
}
