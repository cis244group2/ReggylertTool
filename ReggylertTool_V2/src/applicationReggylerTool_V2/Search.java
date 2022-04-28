package applicationReggylerTool_V2;

import javafx.beans.property.SimpleStringProperty;

public class Search {
	
	private SimpleStringProperty searchID;
	private SimpleStringProperty searchKeyword;
	private SimpleStringProperty searchType;
	private SimpleStringProperty searchDateIdentified;
	private SimpleStringProperty searchTitle;
	private SimpleStringProperty searchSerialNumb;
	private SimpleStringProperty searchLink;
	private SimpleStringProperty searchPubDate;
	
	
	public Search(String searchID, String searchKeyword, String searchType, String searchDateIdentified,
			String searchTitle, String searchSerialNumb, String searchLink, String searchPubDate) {
		this.searchID = new SimpleStringProperty(searchID);
		this.searchKeyword = new SimpleStringProperty(searchKeyword);
		this.searchType = new SimpleStringProperty(searchType);
		this.searchDateIdentified = new SimpleStringProperty(searchDateIdentified);
		this.searchTitle = new SimpleStringProperty(searchTitle);
		this.searchSerialNumb = new SimpleStringProperty(searchSerialNumb);
		this.searchLink = new SimpleStringProperty(searchLink);
		this.searchPubDate = new SimpleStringProperty(searchPubDate);
	}


	public String getSearchID() {
		return searchID.get();
	}


	public void setSearchID(String searchID) {
		this.searchID = new SimpleStringProperty(searchID);
	}


	public String getSearchKeyword() {
		return searchKeyword.get();
	}


	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = new SimpleStringProperty(searchKeyword);
	}


	public String getSearchType() {
		return searchType.get();
	}


	public void setSearchType(String searchType) {
		this.searchType = new SimpleStringProperty(searchType);
	}


	public String getSearchDateIdentified() {
		return searchDateIdentified.get();
	}


	public void setSearchDateIdentified(String searchDateIdentified) {
		this.searchDateIdentified = new SimpleStringProperty(searchDateIdentified);
	}


	public String getSearchTitle() {
		return searchTitle.get();
	}


	public void setSearchTitle(String searchTitle) {
		this.searchTitle = new SimpleStringProperty(searchTitle);
	}


	public String getSearchSerialNumb() {
		return searchSerialNumb.get();
	}


	public void setSearchSerialNumb(String searchSerialNumb) {
		this.searchSerialNumb = new SimpleStringProperty(searchSerialNumb);
	}


	public String getSearchLink() {
		return searchLink.get();
	}


	public void setSearchLink(String searchLink) {
		this.searchLink = new SimpleStringProperty(searchLink);
	}


	public String getSearchPubDate() {
		return searchPubDate.get();
	}


	public void setSearchPubDate(String searchPubDate) {
		this.searchPubDate = new SimpleStringProperty(searchPubDate);
	}
		

}
