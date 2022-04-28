package applicationReggylerTool_V2;

import java.util.*;

public class SearchNotification_RT extends Email {	 
	public static void main(String[] args) {
		Date date = new Date(); 
		
		Email notificationEmail = new Email();
		String from = notificationEmail.getUsername();
		String login = notificationEmail.getPass();
		String[] to = {"jnguyen52@student.ccc.edu"}; //add recipients
		String subject = "Reggylert Search Notification";
		
		String body = "Date: " + date + 
    		  "\n\nHello!\n\nA search has been found. Please refer to the below:\n\n"
    		  + "Best regards,\nReggylert Tool";
		sendEmail(from, login, to, subject, body);
  }
}