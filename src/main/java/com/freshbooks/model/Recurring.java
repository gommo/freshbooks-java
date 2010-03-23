package com.freshbooks.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * recurring.create
 * Create a new recurring profile. The method arguments are nearly identical to invoice.create, but include five additional fields:
 */
@XStreamAlias("recurring")
public class Recurring extends Invoice {
	private static final long serialVersionUID = -4322862130184353619L;
	
	private int occurrences;
	
	private String frequency;
	
	private boolean stopped;
	
	@XStreamAlias("send_email")
	private boolean sendEmail;
	
	@XStreamAlias("send_snail_mail")
	private boolean sendSnailMail;
	
	private Autobill autobill;

	public int getOccurrences() {
		return occurrences;
	}

	public void setOccurrences(int occurrences) {
		this.occurrences = occurrences;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public boolean isStopped() {
		return stopped;
	}

	public void setStopped(boolean stopped) {
		this.stopped = stopped;
	}

	public boolean isSendEmail() {
		return sendEmail;
	}

	public void setSendEmail(boolean sendEmail) {
		this.sendEmail = sendEmail;
	}

	public boolean isSendSnailMail() {
		return sendSnailMail;
	}

	public void setSendSnailMail(boolean sendSnailMail) {
		this.sendSnailMail = sendSnailMail;
	}

	public Autobill getAutobill() {
		return autobill;
	}

	public void setAutobill(Autobill autobill) {
		this.autobill = autobill;
	}
}
