package applicationReggylerTool_V2;

import javafx.beans.property.SimpleStringProperty;

public class Keyword {
	
	private SimpleStringProperty  keyword;
	private SimpleStringProperty  keywordID;
	private SimpleStringProperty  priorityRating;
	private SimpleStringProperty  controlStd;
	private SimpleStringProperty  dateModified;
	private SimpleStringProperty  status;
	
	public Keyword(String keyword, String keywordID, String priorityRating, String controlStd, String dateModified,
			String status) {
		this.keyword = new SimpleStringProperty (keyword);
		this.keywordID = new SimpleStringProperty (keywordID);
		this.priorityRating = new SimpleStringProperty (priorityRating);
		this.controlStd = new SimpleStringProperty (controlStd);
		this.dateModified = new SimpleStringProperty (dateModified);
		this.status = new SimpleStringProperty (status);
	}

	public SimpleStringProperty getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = new SimpleStringProperty(keyword);
	}

	public SimpleStringProperty getKeywordID() {
		return keywordID;
	}

	public void setKeywordID(String keywordID) {
		this.keywordID = new SimpleStringProperty(keywordID);
	}

	public SimpleStringProperty getPriorityRating() {
		return priorityRating;
	}

	public void setPriorityRating(String priorityRating) {
		this.priorityRating = new SimpleStringProperty(priorityRating);
	}

	public SimpleStringProperty getControlStd() {
		return controlStd;
	}

	public void setControlStd(String controlStd) {
		this.controlStd = new SimpleStringProperty(controlStd);
	}

	public SimpleStringProperty getDateModified() {
		return dateModified;
	}

	public void setDateModified(String dateModified) {
		this.dateModified = new SimpleStringProperty (dateModified);
	}

	public SimpleStringProperty getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = new SimpleStringProperty(status);
	}
		

}
