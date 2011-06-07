package com.freshbooks.model;

import java.util.ArrayList;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("clients")
public class Clients extends PagedResponseContent<Client> {
    
    public ArrayList<Client> getClients() {
        return getContents();
    }
}
