module ReggylertTool_V2 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires java.mail;
	requires javafx.graphics;
	requires javafx.base;
	
	opens applicationReggylerTool_V2 to javafx.graphics, javafx.fxml, javafx.base;
}
