package applicationReggylerTool_V2;

import javafx.beans.property.SimpleStringProperty;

//remove SimpleStringProperty ref from getters

public class Recipient {
	
	private SimpleStringProperty recipientName;
	private SimpleStringProperty recipientEmail;
	private SimpleStringProperty recipientStatus;
	
	Recipient(String recipientName, String recipientEmail, String recipientStatus) {
		this.recipientName = new SimpleStringProperty(recipientName);
		this.recipientEmail = new SimpleStringProperty(recipientEmail);
		this.recipientStatus = new SimpleStringProperty(recipientStatus);
	}

	public SimpleStringProperty getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = new SimpleStringProperty(recipientName);
	}

	public SimpleStringProperty getRecipientEmail() {
		return recipientEmail;
	}

	public void setRecipientEmail(String recipientEmail) {
		this.recipientEmail = new SimpleStringProperty(recipientEmail);
	}

	public SimpleStringProperty getRecipientStatus() {
		return recipientStatus;
	}

	public void setRecipientStatus(String recipientStatus) {
		this.recipientStatus = new SimpleStringProperty(recipientStatus);
	}
	
}
