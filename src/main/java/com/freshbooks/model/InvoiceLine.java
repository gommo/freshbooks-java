package com.freshbooks.model;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("line")
public class InvoiceLine implements Serializable {
    private static final long serialVersionUID = -749813547280288310L;
    
    String name;
    String description;
    
    @XStreamAlias("unit_cost")
    double unitCost;
    
    double quantity;
    
    @XStreamAlias("tax1_name")
    String tax1Name;
    @XStreamAlias("tax1_percent")
    String tax1Percent;
    @XStreamAlias("tax2_name")
    String tax2Name;
    @XStreamAlias("tax2_percent")
    String tax2Percent;
    
    Double amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getTax1Name() {
        return tax1Name;
    }

    public void setTax1Name(String tax1Name) {
        this.tax1Name = tax1Name;
    }

    public String getTax1Percent() {
        return tax1Percent;
    }

    public void setTax1Percent(String tax1Percent) {
        this.tax1Percent = tax1Percent;
    }

    public String getTax2Name() {
        return tax2Name;
    }

    public void setTax2Name(String tax2Name) {
        this.tax2Name = tax2Name;
    }

    public String getTax2Percent() {
        return tax2Percent;
    }

    public void setTax2Percent(String tax2Percent) {
        this.tax2Percent = tax2Percent;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof InvoiceLine))
            return false;
        InvoiceLine other = (InvoiceLine) obj;
        if (amount == null) {
            if (other.amount != null)
                return false;
        } else if (!amount.equals(other.amount))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (quantity != other.quantity)
            return false;
        if (tax1Name == null) {
            if (other.tax1Name != null)
                return false;
        } else if (!tax1Name.equals(other.tax1Name))
            return false;
        if (tax1Percent == null) {
            if (other.tax1Percent != null)
                return false;
        } else if (!tax1Percent.equals(other.tax1Percent))
            return false;
        if (tax2Name == null) {
            if (other.tax2Name != null)
                return false;
        } else if (!tax2Name.equals(other.tax2Name))
            return false;
        if (tax2Percent == null) {
            if (other.tax2Percent != null)
                return false;
        } else if (!tax2Percent.equals(other.tax2Percent))
            return false;
        if (unitCost != other.unitCost)
            return false;
        return true;
    }

    public boolean isBlank() {
        return (amount == 0 && description.length()==0 && name.length()==0);
    }
    
}
