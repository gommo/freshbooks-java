package com.freshbooks.model;

import java.util.ArrayList;

public class Expenses extends PagedResponseContent<Expense> {

    ArrayList<Expense> getExpenses() {
        return getContents();
    }
}
