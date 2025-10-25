package com.example.tp.EX2;

public class SMSNotification implements Notification {
	private String senderNumber;

	public SMSNotification(String senderNumber) {
		this.senderNumber = senderNumber;
	}

	@Override
	public void send(String recipient, String message) {
		System.out.printf("[SMS] From: %s To: %s — %s%n", senderNumber, recipient, message);
	}

	@Override
	public int getPriority() {
		return 2;
	}

	@Override
	public String getType() {
		return "SMS";
	}
}