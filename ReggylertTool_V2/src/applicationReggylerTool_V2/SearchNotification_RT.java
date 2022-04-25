package applicationReggylerTool_V2;

import java.util.*;

public class SearchNotification_RT extends Email {	
	public static void main(String[] args) {
		Date date = new Date();
		
		Email notificationEmail = new Email();
		String from = notificationEmail.getUsername();
		String login = notificationEmail.getPass();
		String[] to = {"jnguyen52@student.ccc.edu"}; //add recipients here
		String subject = "Reggylert Search Notification";
		String body = "Date: " + date + 
    		  "\n\nHello! Here are your Reggylert notifications you have subscribed to."; 
		sendEmail(from, login, to, subject, body);
  }
}