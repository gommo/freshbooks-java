package com.freshbooks.model;

import java.util.ArrayList;

public class Recurrings extends PagedResponseContent<Recurring> {
    public ArrayList<Recurring> getCallbacks() {
        return getContents();
    }
}
