package com.flipkart.bean;

import com.flipkart.constants.Status;
import com.flipkart.constants.PaymentModes;

public class Payment {
	private String transactionId;
	private PaymentModes paymentMode;
	private String amount;
	private String timestamp;
	private Status status;
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public PaymentModes getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(PaymentModes paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
}
