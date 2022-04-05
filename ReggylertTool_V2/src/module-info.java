module ReggylertTool_V2 {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens applicationReggylerTool_V2 to javafx.graphics, javafx.fxml;
}
