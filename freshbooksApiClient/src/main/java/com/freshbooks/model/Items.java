package com.freshbooks.model;

import java.util.ArrayList;

public class Items extends PagedResponseContent<Item> {
    public ArrayList<Item> getItems() {
        return getContents();
    }
}
