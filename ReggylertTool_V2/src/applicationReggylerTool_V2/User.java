package applicationReggylerTool_V2;

import java.util.Date;

public class User {
	
	private String userId;
	private String userEmail;
	private String userPassword;
	private String userCompany;
	private Date userAccountCreateDate;
	
	User() {
	}
	
	User(String userId, String userEmail, String userPassword) {
		this.userId = userId;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userCompany = "Company XYZ";
		this.userAccountCreateDate = new Date();
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public String getUserCompany() {
		return userCompany;
	}
	
	public Date getUserAccountCreateDate() {
		return userAccountCreateDate;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	

}
