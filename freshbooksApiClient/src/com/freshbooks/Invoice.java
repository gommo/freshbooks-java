package com.freshbooks;

import java.util.ArrayList;
import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("invoice")
public class Invoice {
    @XStreamAlias("invoice_id")
    String id;
    
    @XStreamAlias("client_id")
    String clientId;
    
    String number;

    String status;
    
    Date date;
    
    @XStreamAlias("po_number")
    String poNumber;
    
    Integer discount;
    String notes;
    String terms;
    
    @XStreamAlias("first_name")
    String firstName;
    
    @XStreamAlias("last_name")
    String lastName;
    
    String organization;
    
    @XStreamAlias("p_street1")
    String street1;
    @XStreamAlias("p_street2")
    String street2;
    @XStreamAlias("p_city")
    String city;
    @XStreamAlias("p_state")
    String state;
    @XStreamAlias("p_country")
    String country;
    @XStreamAlias("p_code")
    String code;
    
    ArrayList<InvoiceLine> lines;
    
    String url;
    @XStreamAlias("auth_url")
    String authUrl;
    @XStreamAlias("recurring_id")
    String recurringId;
    Double amount;
    @XStreamAlias("amount_outstanding")
    Double amountOutstanding;
    
    @XStreamAlias("paid")
    Double amountPaid;
    
    
    Links links;
    
    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getPoNumber() {
        return poNumber;
    }
    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }
    public Integer getDiscount() {
        return discount;
    }
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public String getTerms() {
        return terms;
    }
    public void setTerms(String terms) {
        this.terms = terms;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getOrganization() {
        return organization;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    public String getStreet1() {
        return street1;
    }
    public void setStreet1(String street1) {
        this.street1 = street1;
    }
    public String getStreet2() {
        return street2;
    }
    public void setStreet2(String street2) {
        this.street2 = street2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public ArrayList<InvoiceLine> getLines() {
        return lines;
    }
    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getAuthUrl() {
        return authUrl;
    }
    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }
    public String getRecurringId() {
        return recurringId;
    }
    public void setRecurringId(String recurringId) {
        this.recurringId = recurringId;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Double getAmountOutstanding() {
        return amountOutstanding;
    }
    public void setAmountOutstanding(Double amountOutstanding) {
        this.amountOutstanding = amountOutstanding;
    }
    public Double getAmountPaid() {
        return amountPaid;
    }
    public void setAmountPaid(Double paid) {
        this.amountPaid = paid;
    }
    public Links getLinks() {
        return links;
    }
    public void setLinks(Links links) {
        this.links = links;
    }
}
