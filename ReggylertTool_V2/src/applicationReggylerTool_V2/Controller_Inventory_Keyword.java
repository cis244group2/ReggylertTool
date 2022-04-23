package applicationReggylerTool_V2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class Controller_Inventory_Keyword {

	private Stage stage;
	private Scene scene;
	
    @FXML
    private Button button_keyinvAddKeyword;

    @FXML
    private Button button_keyinvRemoveKeyword;

    @FXML
    private Button button_keyinvReturnToHome;

    @FXML
    private Button button_keyinvUpdateKeyword;

    @FXML
    private TableColumn<?, ?> column_ControlStandardID;

    @FXML
    private TableColumn<?, ?> column_DateModified;

    @FXML
    private TableColumn<?, ?> column_Keyword;

    @FXML
    private TableColumn<?, ?> column_KeywordID;

    @FXML
    private TableColumn<?, ?> column_KeywordStatus;

    @FXML
    private TableColumn<?, ?> column_PriorityRating;

    @FXML
    void action_keyinvAddKeyword(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Record_Keyword.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();    
		}

    @FXML
    void action_keyinvRemoveKeyword(ActionEvent event) {

    }
    
    @FXML
    void action_keyinvUpdateKeyword(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Record_Keyword.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show(); 
    }
    

    @FXML
    void action_keyinvReturnToHome(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("HomePage_RT.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
}	
