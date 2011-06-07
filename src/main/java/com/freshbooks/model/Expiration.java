package com.freshbooks.model;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("expiration")
public class Expiration implements Serializable {
	private static final long serialVersionUID = -6382862130184354619L;

	private String month;
	
	private String year;
	
	public Expiration() {
		
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
