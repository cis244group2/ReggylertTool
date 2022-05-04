package applicationReggylerTool_V2;

import javafx.beans.property.SimpleStringProperty;

public class Recipient {
	
	private SimpleStringProperty recipientName;
	private SimpleStringProperty recipientEmail;
	private SimpleStringProperty recipientStatus;
	
	Recipient() {
	}
	
	Recipient(String recipientName, String recipientEmail, String recipientStatus) {
		this.recipientName = new SimpleStringProperty(recipientName);
		this.recipientEmail = new SimpleStringProperty(recipientEmail);
		this.recipientStatus = new SimpleStringProperty(recipientStatus);
	}

	public String getRecipientName() {
		return recipientName.get();
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = new SimpleStringProperty(recipientName);
	}

	public String getRecipientEmail() {
		return recipientEmail.get();
	}

	public void setRecipientEmail(String recipientEmail) {
		this.recipientEmail = new SimpleStringProperty(recipientEmail);
	}

	public String getRecipientStatus() {
		return recipientStatus.get();
	}

	public void setRecipientStatus(String recipientStatus) {
		this.recipientStatus = new SimpleStringProperty(recipientStatus);
	}
	
}
