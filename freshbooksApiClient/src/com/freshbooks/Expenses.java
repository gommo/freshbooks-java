package com.freshbooks;

import java.util.ArrayList;

public class Expenses extends PagedResponseContent<Expense> {

    ArrayList<Expense> getExpenses() {
        return getContents();
    }
}
