package com.deepa.abstraction.example;

public class MailService {
	
	public void sendEmail() {
		connect();
		authenticate();
//		Send email
		disconnect();
	}
	
//	Make this information/methods private which are not of any use to outside world
	private void connect() {
		System.out.println("Connect");
	}
	
	private void authenticate() {
		System.out.println("Authenticate");
	}
	
	private void disconnect() {
		System.out.println("Disconnect");
	}

}
