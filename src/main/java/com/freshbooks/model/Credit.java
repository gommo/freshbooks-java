package com.freshbooks.model;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("credit")
public class Credit implements Serializable {
	private static final long serialVersionUID = -92837462726454637L;

	String currency;
	double amount;
	
	public Credit() {
		
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
