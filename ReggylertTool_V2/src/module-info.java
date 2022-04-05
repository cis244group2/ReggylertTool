module ReggylertTool_V2 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens applicationReggylerTool_V2 to javafx.graphics, javafx.fxml;
}
