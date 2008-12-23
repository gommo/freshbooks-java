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


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Client))
            return false;
        Client other = (Client) obj;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        } else if (!country.equals(other.country))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (fax == null) {
            if (other.fax != null)
                return false;
        } else if (!fax.equals(other.fax))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (homePhone == null) {
            if (other.homePhone != null)
                return false;
        } else if (!homePhone.equals(other.homePhone))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (mobile == null) {
            if (other.mobile != null)
                return false;
        } else if (!mobile.equals(other.mobile))
            return false;
        if (notes == null) {
            if (other.notes != null)
                return false;
        } else if (!notes.equals(other.notes))
            return false;
        if (organization == null) {
            if (other.organization != null)
                return false;
        } else if (!organization.equals(other.organization))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (secondaryCity == null) {
            if (other.secondaryCity != null)
                return false;
        } else if (!secondaryCity.equals(other.secondaryCity))
            return false;
        if (secondaryCode == null) {
            if (other.secondaryCode != null)
                return false;
        } else if (!secondaryCode.equals(other.secondaryCode))
            return false;
        if (secondaryCountry == null) {
            if (other.secondaryCountry != null)
                return false;
        } else if (!secondaryCountry.equals(other.secondaryCountry))
            return false;
        if (secondaryState == null) {
            if (other.secondaryState != null)
                return false;
        } else if (!secondaryState.equals(other.secondaryState))
            return false;
        if (secondaryStreet1 == null) {
            if (other.secondaryStreet1 != null)
                return false;
        } else if (!secondaryStreet1.equals(other.secondaryStreet1))
            return false;
        if (secondaryStreet2 == null) {
            if (other.secondaryStreet2 != null)
                return false;
        } else if (!secondaryStreet2.equals(other.secondaryStreet2))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        } else if (!state.equals(other.state))
            return false;
        if (street1 == null) {
            if (other.street1 != null)
                return false;
        } else if (!street1.equals(other.street1))
            return false;
        if (street2 == null) {
            if (other.street2 != null)
                return false;
        } else if (!street2.equals(other.street2))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        if (workPhone == null) {
            if (other.workPhone != null)
                return false;
        } else if (!workPhone.equals(other.workPhone))
            return false;
        return true;
    }
    
}
