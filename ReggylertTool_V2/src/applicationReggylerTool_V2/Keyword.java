package applicationReggylerTool_V2;

public class Keyword {
	
	private String keyword;
	private String keywordID;
	private String priorityRating;
	private String controlStd;
	private String dateModified;
	private String status;
	
	public Keyword(String keyword, String keywordID, String priorityRating, String controlStd, String dateModified,
			String status) {
		this.keyword = keyword;
		this.keywordID = keywordID;
		this.priorityRating = priorityRating;
		this.controlStd = controlStd;
		this.dateModified = dateModified;
		this.status = status;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getKeywordID() {
		return keywordID;
	}

	public void setKeywordID(String keywordID) {
		this.keywordID = keywordID;
	}

	public String getPriorityRating() {
		return priorityRating;
	}

	public void setPriorityRating(String priorityRating) {
		this.priorityRating = priorityRating;
	}

	public String getControlStd() {
		return controlStd;
	}

	public void setControlStd(String controlStd) {
		this.controlStd = controlStd;
	}

	public String getDateModified() {
		return dateModified;
	}

	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
		

}
