package applicationReggylerTool_V2;

import java.sql.*;
import java.util.Date;

//SearchNotification_RT.main(null);


public class SearchNotification_RT extends Email {	 
	public static void main(String[] args) throws SQLException {
		SQLhelper sqlHelper = new SQLhelper("Database_RT.db");
		Connection connection = sqlHelper.getConnection();
		PreparedStatement statement = connection.prepareStatement("SELECT email FROM recipientinventory");
		ResultSet rs;
		rs = statement.executeQuery();
		rs.last();
		int numRecipients = rs.getRow(); 
		rs.first();
		
		String[] recipientResults = new String[numRecipients];
		while (rs.next()) {
			recipientResults[numRecipients] = rs.getString("email");
			numRecipients++;
		}		
		
		Date date = new Date(); 		
		Email notificationEmail = new Email();
		String from = notificationEmail.getUsername();
		String login = notificationEmail.getPass();
		String[] to = recipientResults;
		String subject = "Reggylert Search Notification";
		
		String body = "Date: " + date + 
    		  "\n\nHello!\n\nA search has been found. Please refer to the below:\n\n"
    		  + "Best regards,\nReggylert Tool";
		sendEmail(from, login, to, subject, body);
		
		sqlHelper.closeConnection(connection);
  }
}