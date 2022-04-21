package applicationReggylerTool_V2;

import java.util.Date;

public class SECProposedRuleEntry {
	private String title;
	private String link;
	private String serialNumber;
	private Date publicationDate;
	private String type;
	
	
	public SECProposedRuleEntry() {
	}
	
	public SECProposedRuleEntry(String title, String link, String serialNumber, Date publicationDate) {
		this.title = title;
		this.link = link;
		this.serialNumber = serialNumber; // primary key
		this.publicationDate = publicationDate;
		this.type = "SEC";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


