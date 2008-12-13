package com.freshbooks;

import java.util.ArrayList;

public class Invoices extends PagedResponseContent<Invoice> {
    ArrayList<Invoice> getInvoices() {
        return getContents();
    }
}
