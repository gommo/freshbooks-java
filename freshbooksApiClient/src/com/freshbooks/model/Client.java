package com.freshbooks.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("client")
public class Client {
    @XStreamAlias("client_id")
    String id;
    
    @XStreamAlias("first_name")
    String firstName;
    
    @XStreamAlias("last_name")
    String lastName;
    
    String organization;
    String email;
    String username;
    String password;
    
    @XStreamAlias("work_phone")
    String workPhone;
    
    @XStreamAlias("home_phone")
    String homePhone;
    
    String mobile;
    String fax;
    String notes;
    
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

    @XStreamAlias("s_street1")
    String secondaryStreet1;
    @XStreamAlias("s_street2")
    String secondaryStreet2;
    @XStreamAlias("s_city")
    String secondaryCity;
    @XStreamAlias("s_state")
    String secondaryState;
    @XStreamAlias("s_country")
    String secondaryCountry;
    @XStreamAlias("s_code")
    String secondaryCode;
    
    
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getWorkPhone() {
        return workPhone;
    }
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }
    public String getHomePhone() {
        return homePhone;
    }
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getFax() {
        return fax;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
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
    public String getSecondaryStreet1() {
        return secondaryStreet1;
    }
    public void setSecondaryStreet1(String secondaryStreet1) {
        this.secondaryStreet1 = secondaryStreet1;
    }
    public String getSecondaryStreet2() {
        return secondaryStreet2;
    }
    public void setSecondaryStreet2(String secondaryStreet2) {
        this.secondaryStreet2 = secondaryStreet2;
    }
    public String getSecondaryCity() {
        return secondaryCity;
    }
    public void setSecondaryCity(String secondaryCity) {
        this.secondaryCity = secondaryCity;
    }
    public String getSecondaryState() {
        return secondaryState;
    }
    public void setSecondaryState(String secondaryState) {
        this.secondaryState = secondaryState;
    }
    public String getSecondaryCountry() {
        return secondaryCountry;
    }
    public void setSecondaryCountry(String secondaryCountry) {
        this.secondaryCountry = secondaryCountry;
    }
    public String getSecondaryCode() {
        return secondaryCode;
    }
    public void setSecondaryCode(String secondaryCode) {
        this.secondaryCode = secondaryCode;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
}
