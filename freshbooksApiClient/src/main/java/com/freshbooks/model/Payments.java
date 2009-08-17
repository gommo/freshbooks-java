package com.freshbooks.model;

import java.util.ArrayList;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("payments")
public class Payments extends PagedResponseContent<Payment> {
    ArrayList<Payment> getPayments() {
        return getContents();
    }
}
