package applicationReggylerTool_V2;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
//import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;


public class SearchNotification_RT {
public static void main(String [] args) {
	// email ID of Recipient.
	String recipient = "recipient@gmail.com";

	// email ID of Sender.
	String sender = "cis244group2@gmail.com";

	// using host as localhost
	String host = "127.0.0.1";

	// Getting system properties
	Properties properties = System.getProperties();

	// Setting up mail server
	properties.setProperty("mail.smtp.host", host);

	// creating session object to get properties
	Session session = Session.getDefaultInstance(properties);

	try
	{
		// MimeMessage object.
		MimeMessage message = new MimeMessage(session);

		// Set From Field: adding senders email to from field.
		message.setFrom(new InternetAddress(sender));

		// Set To Field: adding recipient's email to from field.
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));

		// Set Subject: subject of the email
		message.setSubject("Reggylert Notifications");

		// set body of the email.
		message.setText("Please see the updates that you have subscribed to through your notification settings.");

		// Send email.
		Transport.send(message);
		System.out.println("Mail successfully sent");
	}
	catch (MessagingException mex)
	{
		mex.printStackTrace();
	}
}
}
