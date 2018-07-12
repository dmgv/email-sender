package com.javaee.emailsender;

public class EmailSender {

	public static void main(String[] args) {
		final String fromEmail = "diego.menezzes@gmail.com";
		final String password = "minha senha";
		final String toEmail = "sntsphlp@gmail.com";
		
		System.out.println("Initializing email send");
		
		EmailConfig config = new EmailConfig();
		
		config.sendEmail(fromEmail, password, toEmail, "Subject", "Email Body");
	}

}
