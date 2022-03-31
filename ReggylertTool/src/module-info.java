module ReggylertTool {
	requires javafx.controls;
	requires java.sql;
	
	opens applicationReggylertTool to javafx.graphics, javafx.fxml;
}
