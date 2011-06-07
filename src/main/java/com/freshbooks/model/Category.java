package com.freshbooks.model;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("category")
public class Category implements Serializable {
    private static final long serialVersionUID = 613498591544651289L;
    
    @XStreamAlias("category_id")
    Long id;
    String name;
    String tax1;
    String tax2;
    
    public Category() {
    }
    
    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Category))
            return false;
        Category other = (Category) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (tax1 == null) {
            if (other.tax1 != null)
                return false;
        } else if (!tax1.equals(other.tax1))
            return false;
        if (tax2 == null) {
            if (other.tax2 != null)
                return false;
        } else if (!tax2.equals(other.tax2))
            return false;
        return true;
    }
    
}
