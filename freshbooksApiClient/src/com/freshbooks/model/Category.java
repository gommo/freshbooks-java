package com.freshbooks.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("category")
public class Category {
    @XStreamAlias("category_id")
    String id;
    String name;
    String tax1;
    String tax2;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTax1() {
        return tax1;
    }
    public void setTax1(String tax1) {
        this.tax1 = tax1;
    }
    public String getTax2() {
        return tax2;
    }
    public void setTax2(String tax2) {
        this.tax2 = tax2;
    }
    
}
