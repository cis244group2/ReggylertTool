package applicationReggylerTool_V2;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;
import javax.mail.Transport;

public class SearchNotification_RT {
	private static String USERNAME = "cis244group2@gmail.com"; 
	private static String PASS = "NOTTHEPASSWORD"; //put in password here
	private static String RECIPIENT1 = "jnguyen52@student.ccc.edu"; //field_recipientEmail;
	private static String RECIPIENT2 = "garias1@student.ccc.edu"; //field_recipientEmail;
	private static String RECIPIENT3 = "jhector1@student.ccc.edu"; //field_recipientEmail;
	private static String RECIPIENT4 = "poliveira1@student.ccc.edu"; //field_recipientEmail;

	
  public static void main(String[] args) {
      String from = USERNAME;
      String login = PASS;
      String[] to = { RECIPIENT1, RECIPIENT2, RECIPIENT3, RECIPIENT4 }; //recipient email addresses, can leave it to RECIPIENT1
      String subject = "Reggylert Notifications";
      String body = "Hello! Here are your Reggylert notifications you have subscribed to."; 
      // field_recipientFirstName + " " + field_recipientFirstName + "'s Notifications";
      sendEmail(from, login, to, subject, body);
  }

  private static void sendEmail(String from, String pass, String[] to, String subject, String body) {
      Properties props = System.getProperties();
      String host = "smtp.gmail.com";
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.user", from);
      props.put("mail.smtp.password", pass);
      props.put("mail.smtp.port", "587");
      props.put("mail.smtp.auth", "true");

      Session session = Session.getDefaultInstance(props);
      MimeMessage message = new MimeMessage(session);

      try {
          message.setFrom(new InternetAddress(from));
          InternetAddress[] toAddress = new InternetAddress[to.length];

          // To get the array of addresses
          for( int i = 0; i < to.length; i++ ) {
              toAddress[i] = new InternetAddress(to[i]);
          }

          for( int i = 0; i < toAddress.length; i++) {
              message.addRecipient(Message.RecipientType.TO, toAddress[i]);
          }

          message.setSubject(subject);
          message.setText(body);
          Transport transport = session.getTransport("smtp");
          transport.connect(host, from, pass);
          transport.sendMessage(message, message.getAllRecipients());
          transport.close();
      }
      catch (AddressException ae) {
          ae.printStackTrace();
      }
      catch (MessagingException me) {
          me.printStackTrace();
      }
  }
}