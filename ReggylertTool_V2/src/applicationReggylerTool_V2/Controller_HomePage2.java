package applicationReggylerTool_V2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class Controller_HomePage2 implements Initializable {
	
	private Stage stage;
	private Scene scene;

    @FXML
    private Button button_AddNewRecipient;
    
    @FXML
    private Button button_Logout;

    @FXML
    private Button button_RemoveRecipient;

    @FXML
    private Button button_UpdateRecipient;

    @FXML
    private Button button_keyinvAddKeyword;

    @FXML
    private Button button_keyinvRemoveKeyword;

    @FXML
    private Button button_keyinvUpdateKeyword;

    @FXML
    private TableColumn<?, ?> column_ControlStandardID;

    @FXML
    private TableColumn<?, ?> column_DateIdentified;

    @FXML
    private TableColumn<?, ?> column_DateModified;

    @FXML
    private TableColumn<?, ?> column_Keyword;

    @FXML
    private TableColumn<?, ?> column_Keyword1;

    @FXML
    private TableColumn<?, ?> column_KeywordID;

    @FXML
    private TableColumn<?, ?> column_KeywordStatus;

    @FXML
    private TableColumn<?, ?> column_Link;

    @FXML
    private TableColumn<?, ?> column_PriorityRating;

    @FXML
    private TableColumn<?, ?> column_PublicationDate;

    @FXML
    private TableColumn<?, ?> column_SearchID;

    @FXML
    private TableColumn<?, ?> column_SerialNumber;

    @FXML
    private TableColumn<?, ?> column_Title;

    @FXML
    private TableColumn<?, ?> column_Type;
    
    @FXML
    private TableColumn<?, ?> column_emailRecipient;

    @FXML
    private TableColumn<?, ?> column_nameRecipient;

    @FXML
    private TableColumn<?, ?> column_statusRecipient;

    @FXML
    private Label field_homeUserName;

    @FXML
    private TableView<?> table_Keyword;
    
    @FXML
    private TableView<?> table_Recipient;
    
    @FXML
    private TableView<?> table_Search;
        
    public void setUsername(String name) {
    	field_homeUserName.setText("Welcome " + name);
    }

    @FXML
    void action_AddNewRecipient(ActionEvent event) {

    }

    @FXML
    void action_RemoveRecipient(ActionEvent event) {

    }

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
    void add_UpdateRecipient(ActionEvent event) {

    }
    
    @FXML
    void action_Logout(ActionEvent event) {
    	System.exit(0);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

}
