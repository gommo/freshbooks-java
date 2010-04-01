package com.freshbooks.reporting;

import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import com.freshbooks.ApiConnection;
import com.freshbooks.ApiException;
import com.freshbooks.model.Invoice;

public class ClientAgingReport implements Serializable {
	private static final long serialVersionUID = 1837462352738297376L;
	
	public static ClientAgingReport getReport(Long clientId, ApiConnection api) throws IOException, ApiException {
		ClientAgingReport report = new ClientAgingReport();
		report.setClientId(clientId);
		
		Calendar date_30 = new GregorianCalendar();
		Calendar date_60 = new GregorianCalendar();
		Calendar date_90 = new GregorianCalendar();
		
		date_30.add(Calendar.DAY_OF_YEAR, -31);
		date_60.add(Calendar.DAY_OF_YEAR, -61);
		date_90.add(Calendar.DAY_OF_YEAR, -91);
		
		double balance0to30 = 0;
		double balance30to60 = 0;
		double balance60to90 = 0;
		double balance90plus = 0;
		
		int page = 1;
		Iterator<Invoice> list = api.listInvoices(page, 100, null, null, clientId, "unpaid").iterator();
		while ( true ) {
			int c = 0;
			while ( list.hasNext() ) {
				c++;
				Invoice invoice = list.next();
				Date dt = invoice.getDate();
				if ( dt.before(date_90.getTime()) ) {
					balance90plus += invoice.getAmountOutstanding();
				}
				else if ( dt.before(date_60.getTime()) ) {
					balance60to90 += invoice.getAmountOutstanding();
				}
				else if ( dt.before(date_30.getTime()) ) {
					balance30to60 += invoice.getAmountOutstanding();
				}
				else {
					balance0to30 += invoice.getAmountOutstanding();
				}
			}
			if ( c >= 100 ) {
				page++;
				list = api.listInvoices(page, 100, null, null, clientId, "unpaid").iterator();
			}
			else {
				break;
			}
		}
		
		report.setDate30(date_30.getTime());
		report.setDate60(date_60.getTime());
		report.setDate90(date_90.getTime());
		report.setBalance0to30(balance0to30);
		report.setBalance30to60(balance30to60);
		report.setBalance60to90(balance60to90);
		report.setBalance90plus(balance90plus);
		
		return report;
	}
	
	private long clientId;
	private double balance0to30;
	private double balance30to60;
	private double balance60to90;
	private double balance90plus;
	private Date date30;
	private Date date60;
	private Date date90;
	
	public ClientAgingReport() {
		
	}

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public double getBalance0to30() {
		return balance0to30;
	}

	public void setBalance0to30(double balance0to30) {
		this.balance0to30 = balance0to30;
	}

	public double getBalance30to60() {
		return balance30to60;
	}

	public void setBalance30to60(double balance30to60) {
		this.balance30to60 = balance30to60;
	}

	public double getBalance60to90() {
		return balance60to90;
	}

	public void setBalance60to90(double balance60to90) {
		this.balance60to90 = balance60to90;
	}

	public double getBalance90plus() {
		return balance90plus;
	}

	public void setBalance90plus(double balance90plus) {
		this.balance90plus = balance90plus;
	}

	public Date getDate30() {
		return date30;
	}

	public void setDate30(Date date30) {
		this.date30 = date30;
	}

	public Date getDate60() {
		return date60;
	}

	public void setDate60(Date date60) {
		this.date60 = date60;
	}

	public Date getDate90() {
		return date90;
	}

	public void setDate90(Date date90) {
		this.date90 = date90;
	}
}
