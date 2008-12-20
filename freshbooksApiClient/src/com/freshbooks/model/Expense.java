package com.freshbooks.model;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("expense")
public class Expense {
    @XStreamAlias("expense_id")
    String id;
    @XStreamAlias("staff_id")
    String staffId;
    @XStreamAlias("category_id")
    String categoryId;
    @XStreamAlias("project_id")
    String projectId;
    @XStreamAlias("client_id")
    String clientId;
    Double amount;
    String notes;
    String status;
    Date date;
    
    @XStreamAlias("tax1_name")
    String tax1Name;
    @XStreamAlias("tax1_percent")
    String tax1Percent;
    @XStreamAlias("tax1_amount")
    String tax1Amount;
    
    @XStreamAlias("tax2_name")
    String tax2Name;
    @XStreamAlias("tax2_percent")
    String tax2Percent;
    @XStreamAlias("tax2_amount")
    String tax2Amount;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getStaffId() {
        return staffId;
    }
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
    public String getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
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
    public String getTax1Amount() {
        return tax1Amount;
    }
    public void setTax1Amount(String tax1Amount) {
        this.tax1Amount = tax1Amount;
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
    public String getTax2Amount() {
        return tax2Amount;
    }
    public void setTax2Amount(String tax2Amount) {
        this.tax2Amount = tax2Amount;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Expense))
            return false;
        Expense other = (Expense) obj;
        if (amount == null) {
            if (other.amount != null)
                return false;
        } else if (!amount.equals(other.amount))
            return false;
        if (categoryId == null) {
            if (other.categoryId != null)
                return false;
        } else if (!categoryId.equals(other.categoryId))
            return false;
        if (clientId == null) {
            if (other.clientId != null)
                return false;
        } else if (!clientId.equals(other.clientId))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (notes == null) {
            if (other.notes != null)
                return false;
        } else if (!notes.equals(other.notes))
            return false;
        if (projectId == null) {
            if (other.projectId != null)
                return false;
        } else if (!projectId.equals(other.projectId))
            return false;
        if (staffId == null) {
            if (other.staffId != null)
                return false;
        } else if (!staffId.equals(other.staffId))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (tax1Amount == null) {
            if (other.tax1Amount != null)
                return false;
        } else if (!tax1Amount.equals(other.tax1Amount))
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
        if (tax2Amount == null) {
            if (other.tax2Amount != null)
                return false;
        } else if (!tax2Amount.equals(other.tax2Amount))
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
        return true;
    }
    
}
