/* 
 * Send email
 * SMTP server details: https://support.google.com/a/answer/176600
 * "Other setup options" > "Use the Gmail SMTP server"
 */

package applicationReggylerTool_V2;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {	
	private String username;
	private String pass;
	
	public Email() {
		this.username = "cis244group2@gmail.com";
		this.pass = "putpassword"; //replace with password
	}
	
	public Email(String username, String pass) {
		this.username = username;
		this.pass = pass;
	}
	
	public String getUsername(){
		return username;
	}

	public String getPass() {
		return pass;
	}
	
	public void setUsername(String username){
		this.username = username;
	}

	public void setPass(String password) {
		this.pass = password;
	} 

	public static void sendEmail(String from, String pass, String[] to, String subject, String body) {
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
	
	public static void accountCreationEmail(String recipient) {
		Email fromEmail = new Email();
		String from = fromEmail.getUsername();
		String login = fromEmail.getPass();
		String[] to = {recipient}; 
		String subject = "Reggylert Account Creation";
		String body = "Hello! You have created an account for Reggylert. Your login username is " + recipient + ". Please log in."; 
		sendEmail(from, login, to, subject, body);
	}
}