package com.example.tp.EX2;

public interface Notification {
	void send(String recipient, String message);

	int getPriority();

	String getType();
}