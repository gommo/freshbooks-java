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
    
}
