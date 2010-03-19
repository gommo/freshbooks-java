package com.freshbooks.model;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("callback")
public class Callback implements Serializable {
	private static final long serialVersionUID = -2844176221802674836L;
	
	@XStreamAlias("callback_id")
	private Long callbackId;
	
	@XStreamAlias("event")
	private String event;
	
	private String verifier;
	
	private String uri;
	
	public Callback() {
		
	}

	public Long getCallbackId() {
		return callbackId;
	}

	public void setCallbackId(Long callbackId) {
		this.callbackId = callbackId;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getVerifier() {
		return verifier;
	}

	public void setVerifier(String verifier) {
		this.verifier = verifier;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
}
