package com.freshbooks;

import java.util.ArrayList;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("clients")
public class Clients extends PagedResponseContent<Client> {
    
    ArrayList<Client> getClients() {
        return getContents();
    }
}
