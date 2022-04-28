package applicationReggylerTool_V2;

public class Search {
	
	private String searchID;
	private String searchKeyword;
	private String searchType;
	private String searchDateIdentified;
	private String searchTitle;
	private String searchSerialNumb;
	private String searchLink;
	private String searchPubDate;
	
	
	public Search(String searchID, String searchKeyword, String searchType, String searchDateIdentified,
			String searchTitle, String searchSerialNumb, String searchLink, String searchPubDate) {
		this.searchID = searchID;
		this.searchKeyword = searchKeyword;
		this.searchType = searchType;
		this.searchDateIdentified = searchDateIdentified;
		this.searchTitle = searchTitle;
		this.searchSerialNumb = searchSerialNumb;
		this.searchLink = searchLink;
		this.searchPubDate = searchPubDate;
	}


	public String getSearchID() {
		return searchID;
	}


	public void setSearchID(String searchID) {
		this.searchID = searchID;
	}


	public String getSearchKeyword() {
		return searchKeyword;
	}


	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}


	public String getSearchType() {
		return searchType;
	}


	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}


	public String getSearchDateIdentified() {
		return searchDateIdentified;
	}


	public void setSearchDateIdentified(String searchDateIdentified) {
		this.searchDateIdentified = searchDateIdentified;
	}


	public String getSearchTitle() {
		return searchTitle;
	}


	public void setSearchTitle(String searchTitle) {
		this.searchTitle = searchTitle;
	}


	public String getSearchSerialNumb() {
		return searchSerialNumb;
	}


	public void setSearchSerialNumb(String searchSerialNumb) {
		this.searchSerialNumb = searchSerialNumb;
	}


	public String getSearchLink() {
		return searchLink;
	}


	public void setSearchLink(String searchLink) {
		this.searchLink = searchLink;
	}


	public String getSearchPubDate() {
		return searchPubDate;
	}


	public void setSearchPubDate(String searchPubDate) {
		this.searchPubDate = searchPubDate;
	}
		

}
