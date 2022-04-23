package applicationReggylerTool_V2;

public class SecDocData {
	private String publication;
	private String link;
	private String note;
	
	
	public SecDocData(String publication, String link, String note) {
		this.publication = publication;
		this.link = link;
		this.note = note;
	}
	
	public String getPublication() {
		return publication;
	}
	
	public String getLink() {
		return link;
	}
	
	public String getNote() {
		return note;
	}
}
