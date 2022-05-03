package applicationReggylerTool_V2;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Controller_Record_NotificationRecipient {

	@FXML
    private Button button_recipientSubmit;

    @FXML
    private TextField field_recipientEmail;

    @FXML
    private TextField field_recipientName;

    @FXML
    private TextField field_recipientStatus;

    @FXML
    void button_recipientSubmit(ActionEvent event) throws IOException {
    	
    	this.save_Recipientrecord();
        	
    	try {
    		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    		stage.close();
    		
    	} catch (Exception e) {
			e.printStackTrace();
		}

    }    
    
    void save_Recipientrecord() {
    	SQLhelper sqlHelper = new SQLhelper("Database_RT.db"); 
    	String sql = String.format("INSERT INTO recipientinventory (name, email, status) VALUES('%s', '%s', '%s');",
    			this.field_recipientName.getText(), this.field_recipientEmail.getText(), this.field_recipientStatus.getText());
    	
    	try {
    		sqlHelper.execute(sql);
    		System.out.println("Recorded was added successfully");
    	}
    	catch(Exception ex) {
    		System.out.println("Error!");
    	}
    	
    }
    
    
	FXMLLoader loadFxml(String filename) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(filename));
		return loader;
	}

}
