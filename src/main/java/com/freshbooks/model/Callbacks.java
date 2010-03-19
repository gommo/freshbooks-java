package com.freshbooks.model;

import java.util.ArrayList;

public class Callbacks extends PagedResponseContent<Callback> {
    public ArrayList<Callback> getCallbacks() {
        return getContents();
    }
}
