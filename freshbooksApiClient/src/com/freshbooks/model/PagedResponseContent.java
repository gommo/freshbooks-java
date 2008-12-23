package com.freshbooks.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class PagedResponseContent<T> implements Iterable<T> {
    @XStreamAsAttribute
    int page;
    @XStreamAsAttribute
    @XStreamAlias("per_page")
    int perPage;
    @XStreamAsAttribute
    int pages;
    @XStreamAsAttribute
    int total;
    
    
    @XStreamImplicit
    ArrayList<T> contents;

    public ArrayList<T> getContents() {
        return contents;
    }

    public void setContents(ArrayList<T> contents) {
        this.contents = contents;
    }
    
    
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean add(T e) {
        return contents.add(e);
    }

    public T get(int index) {
        return contents.get(index);
    }

    public boolean isEmpty() {
        return contents == null || contents.isEmpty();
    }

    public Iterator<T> iterator() {
        if(contents == null) {
            List<T> emptyList = Collections.emptyList();
            return emptyList.iterator();
        }
        return contents.iterator();
    }

    public int size() {
        return contents.size();
    }


}
