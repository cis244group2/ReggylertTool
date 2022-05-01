package applicationReggylerTool_V2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Controller_Record_NotificationRecipient {

    @FXML
    private Button button_recipientSubmit;

    @FXML
    private TextField field_recipientEmail;

    @FXML
    private TextField field_recipientFirstName;

    @FXML
    private TextField field_recipientLastName;

    @FXML
    private ChoiceBox<?> field_recipientStatus;

    @FXML
    void button_recipientFirstName(ActionEvent event) throws IOException {
    	
    	try {
    		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    		stage.close();
    		
    	} catch (Exception e) {
			e.printStackTrace();
		}

    }
    
    
	FXMLLoader loadFxml(String filename) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(filename));
		return loader;
	}

}
