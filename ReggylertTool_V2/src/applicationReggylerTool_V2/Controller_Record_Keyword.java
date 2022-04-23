package applicationReggylerTool_V2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller_Record_Keyword {
	
	private Stage stage;
	private Scene scene;

    @FXML
    private Button button_SubmitKeyword;

    @FXML
    private TextField field_ControlStandardID;

    @FXML
    private TextField field_DateModified;

    @FXML
    private TextField field_Keyword;

    @FXML
    private TextField field_KeywordID;

    @FXML
    private TextField field_KeywordStatus;

    @FXML
    private TextField field_PriorityTierRating;

    @FXML
    void action_SubmitKeyword(ActionEvent event) throws IOException {
    	
    	this.save_record();
    	
    	
    	
		Parent root = FXMLLoader.load(getClass().getResource("Inventory_Keyword.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    void save_record() {
    	SQLhelper sqlHelper = new SQLhelper("Database_RT.db"); 
    	String sql = String.format("INSERT INTO keywordinventory (keyword, keywordid, priorityrating, controlstandardid, datemodified, status) VALUES('%s', '%s', '%s', '%s', '%s', '%s');",
    			this.field_Keyword.getText(), this.field_KeywordID.getText(), this.field_PriorityTierRating.getText(), this.field_ControlStandardID.getText(), this.field_DateModified.getText(), this.field_KeywordStatus.getText());
    	
    	try {
//    		System.out.println(sql);
    		sqlHelper.execute(sql);
    		System.out.println("Recorded was added successfully");
    	}
    	catch(Exception ex) {
    		System.out.println("Error!");
    	}
    	
    }

}
