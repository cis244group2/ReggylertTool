package applicationReggylerTool_V2;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

//SearchNotification_RT.main(null);


public class SearchNotification_RT extends Email {	 
	public static void main(String[] args) throws SQLException {
		SQLhelper sqlHelper = new SQLhelper("Database_RT.db");
		Connection connection = sqlHelper.getConnection();		
		Statement st = connection.createStatement(); 
		ResultSet rs = st.executeQuery("SELECT email FROM recipientinventory");		

		ArrayList<String> recips = new ArrayList<String>();
		while (rs.next()) {
			recips.add(rs.getString("email"));
		}		
				
		String array[] = new String[recips.size()];              
		for(int j =0;j<recips.size();j++){
		  array[j] = recips.get(j);
		}
		
		Date date = new Date(); 		
		Email notificationEmail = new Email();
		String from = notificationEmail.getUsername();
		String login = notificationEmail.getPass();
		String[] to = array;
		String subject = "Reggylert Search Notification";
		
		String body = "Date: " + date + 
    		  "\n\nHello!\n\nA search has been found. Please refer to the below:\n\n"
    		  + "Best regards,\nReggylert Tool";
		sendEmail(from, login, to, subject, body);
		
		sqlHelper.closeConnection(connection);
  }
}