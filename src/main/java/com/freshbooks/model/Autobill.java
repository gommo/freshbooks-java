package com.freshbooks.model;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("autobill")
public class Autobill implements Serializable {
	private static final long serialVersionUID = -6382862130184354619L;
	
	@XStreamAlias("gateway_name")
	private String gatewayName;
	
	private Card card;
	
	public Autobill() {
		
	}

	public String getGatewayName() {
		return gatewayName;
	}

	public void setGatewayName(String gatewayName) {
		this.gatewayName = gatewayName;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
}
