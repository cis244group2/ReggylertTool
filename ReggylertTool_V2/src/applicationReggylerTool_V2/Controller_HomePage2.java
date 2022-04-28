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
	
	// Buttons
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
    
    
    
    // Recipient Table
    @FXML
    private TableColumn<Recipient, String> column_emailRecipient;
    
    @FXML
    private TableColumn<Recipient, String> column_statusRecipient;
    
    @FXML
    private TableColumn<Recipient, String> column_nameRecipient;
    
    @FXML
    private TableView<Recipient> table_Recipient;
    
    
    
    // Keyword Inventory Table
    @FXML
    private TableColumn<Keyword, String> column_invControlStandardID;
    
    @FXML
    private TableColumn<Keyword, String> column_invDateModified;
    
    @FXML
    private TableColumn<Keyword, String> column_invKeyword;

    @FXML
    private TableColumn<Keyword, String> column_invKeywordID;

    @FXML
    private TableColumn<Keyword, String> column_invPriorityRating;

    @FXML
    private TableColumn<Keyword, String> column_invStatus;
    
    @FXML
    private TableView<Keyword> table_Keyword;
    
    
    
    // Search Table 
    @FXML
    private TableColumn<Search, String> column_Link;

    @FXML
    private TableColumn<Search, String> column_PublicationDate;

    @FXML
    private TableColumn<Search, String> column_SerialNumber;

    @FXML
    private TableColumn<Search, String> column_searchDateIdentified;

    @FXML
    private TableColumn<Search, String> column_searchID;

    @FXML
    private TableColumn<Search, String> column_searchKeyword;

    @FXML
    private TableColumn<Search, String> column_searchTitle;

    @FXML
    private TableColumn<Search, String> column_searchType;
    
    @FXML
    private TableView<Search> table_Search;
    
    

    // Home Page User Name Label
    @FXML
    private Label field_homeUserName;
        
    public void setUsername(String name) {
    	field_homeUserName.setText(name);
    }

    @FXML
    void action_AddNewRecipient(ActionEvent event) throws IOException {
    	
    	// UPDATE CODE TO LOAD SEPARATELY AND FOR REFRESH OF TABLE
    	
    	Parent root = FXMLLoader.load(getClass().getResource("Record_NotificationRecipient.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();  
    }

    @FXML
    void action_RemoveRecipient(ActionEvent event) {
    	// ADD CODE FOR REMOVING SELECTED RECIPIENT FROM TABLE AND FOR REFRESH OF TABLE
    }
    
    @FXML
    void add_UpdateRecipient(ActionEvent event) {
    	
    	// UPDATE CODE TO LOAD SEPARATELY WITH RECIPIENT SELECTED ON TABLE

    }

    @FXML
    void action_keyinvAddKeyword(ActionEvent event) throws IOException {
    	
    	// UPDATE CODE TO LOAD SEPARATELY AND FOR REFRESH OF TABLE
    	
    	Parent root = FXMLLoader.load(getClass().getResource("Record_Keyword.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();  
    }

    @FXML
    void action_keyinvUpdateKeyword(ActionEvent event) throws IOException {
    	
    	// UPDATE CODE TO LOAD SEPARATELY AND FOR REFRESH OF TABLE
    	
    	Parent root = FXMLLoader.load(getClass().getResource("Record_Keyword.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();  
    }
    
    @FXML
    void action_keyinvRemoveKeyword(ActionEvent event) {
    	
    	// ADD CODE FOR REMOVING SELECTED KEYWORD FROM TABLE AND FOR REFRESH OF TABLE
    }
    
    @FXML
    void action_Logout(ActionEvent event) {
    	System.exit(0);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// ADD CODE FOR LOADING TABLES AND COLUMNS
		
	}

}
