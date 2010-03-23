package com.freshbooks.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Message {

    @XStreamAlias("client_id")
    protected Long clientId;
    protected Client client;
    protected Clients clients;
    
    @XStreamAlias("invoice_id")
    protected Long invoiceId;
    protected Invoice invoice;
    protected Invoices invoices;

    @XStreamAlias("staff_id")
    protected Long staffId;
    
    @XStreamAlias("expense_id")
    protected Long expenseId;
    protected Expense expense;
    protected Expenses expenses;
    
    @XStreamAlias("payment_id")
    protected Long paymentId;
    protected Payment payment;
    protected Payments payments;
    
    @XStreamAlias("category_id")
    protected Long categoryId;
    protected Category category;
    protected Categories categories;
    
    @XStreamAlias("item_id")
    protected Long itemId;
    protected Item item;
    protected Items items;
    
    @XStreamAlias("callback_id")
    protected Long callbackId;
    protected Callback callback;
    protected Callbacks callbacks;
    
    @XStreamAlias("recurring_id")
    protected Long recurringId;
    protected Recurring recurring;
    protected Recurrings recurrings;
    
    @XStreamAlias("project_id")
    protected Long projectId;
    
    public Message() {
        super();
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public Invoices getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoices invoices) {
        this.invoices = invoices;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }

    public Expense getExpense() {
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

    public Expenses getExpenses() {
        return expenses;
    }

    public void setExpenses(Expenses expenses) {
        this.expenses = expenses;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Payments getPayments() {
        return payments;
    }

    public void setPayments(Payments payments) {
        this.payments = payments;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

	public Long getCallbackId() {
		return callbackId;
	}

	public void setCallbackId(Long callbackId) {
		this.callbackId = callbackId;
	}

	public Callback getCallback() {
		return callback;
	}

	public void setCallback(Callback callback) {
		this.callback = callback;
	}

	public Callbacks getCallbacks() {
		return callbacks;
	}

	public void setCallbacks(Callbacks callbacks) {
		this.callbacks = callbacks;
	}

	public Long getRecurringId() {
		return recurringId;
	}

	public void setRecurringId(Long recurringId) {
		this.recurringId = recurringId;
	}

	public Recurring getRecurring() {
		return recurring;
	}

	public void setRecurring(Recurring recurring) {
		this.recurring = recurring;
	}

	public Recurrings getRecurrings() {
		return recurrings;
	}

	public void setRecurrings(Recurrings recurrings) {
		this.recurrings = recurrings;
	}
}