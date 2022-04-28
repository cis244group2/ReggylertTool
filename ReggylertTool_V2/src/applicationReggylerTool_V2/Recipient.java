package applicationReggylerTool_V2;

public class Recipient {
	
	private String recipientName;
	private String recipientEmail;
	private String recipientStatus;
	
	Recipient(String recipientName, String recipientEmail, String recipientStatus) {
		this.recipientName = recipientName;
		this.recipientEmail = recipientEmail;
		this.recipientStatus = recipientStatus;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getRecipientEmail() {
		return recipientEmail;
	}

	public void setRecipientEmail(String recipientEmail) {
		this.recipientEmail = recipientEmail;
	}

	public String getRecipientStatus() {
		return recipientStatus;
	}

	public void setRecipientStatus(String recipientStatus) {
		this.recipientStatus = recipientStatus;
	}
	
}
