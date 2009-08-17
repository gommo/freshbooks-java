package com.freshbooks.model;

import java.util.ArrayList;

public class Invoices extends PagedResponseContent<Invoice> {
    ArrayList<Invoice> getInvoices() {
        return getContents();
    }
}
