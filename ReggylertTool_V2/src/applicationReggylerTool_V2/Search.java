package applicationReggylerTool_V2;

import javafx.beans.property.SimpleStringProperty;

//remove SimpleStringProperty ref from getters

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


	public SimpleStringProperty getSearchID() {
		return searchID;
	}


	public void setSearchID(String searchID) {
		this.searchID = new SimpleStringProperty(searchID);
	}


	public SimpleStringProperty getSearchKeyword() {
		return searchKeyword;
	}


	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = new SimpleStringProperty(searchKeyword);
	}


	public SimpleStringProperty getSearchType() {
		return searchType;
	}


	public void setSearchType(String searchType) {
		this.searchType = new SimpleStringProperty(searchType);
	}


	public SimpleStringProperty getSearchDateIdentified() {
		return searchDateIdentified;
	}


	public void setSearchDateIdentified(String searchDateIdentified) {
		this.searchDateIdentified = new SimpleStringProperty(searchDateIdentified);
	}


	public SimpleStringProperty getSearchTitle() {
		return searchTitle;
	}


	public void setSearchTitle(String searchTitle) {
		this.searchTitle = new SimpleStringProperty(searchTitle);
	}


	public SimpleStringProperty getSearchSerialNumb() {
		return searchSerialNumb;
	}


	public void setSearchSerialNumb(String searchSerialNumb) {
		this.searchSerialNumb = new SimpleStringProperty(searchSerialNumb);
	}


	public SimpleStringProperty getSearchLink() {
		return searchLink;
	}


	public void setSearchLink(String searchLink) {
		this.searchLink = new SimpleStringProperty(searchLink);
	}


	public SimpleStringProperty getSearchPubDate() {
		return searchPubDate;
	}


	public void setSearchPubDate(String searchPubDate) {
		this.searchPubDate = new SimpleStringProperty(searchPubDate);
	}
		

}
