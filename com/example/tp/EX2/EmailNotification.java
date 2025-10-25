package com.example.tp.EX2;

public class EmailNotification implements Notification {
	private String fromAddress;

	public EmailNotification(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	@Override
	public void send(String recipient, String message) {
		System.out.printf("[Email] From: %s To: %s — %s%n", fromAddress, recipient, message);
	}

	@Override
	public int getPriority() {
		return 1;
	}

	@Override
	public String getType() {
		return "Email";
	}
}