package applicationReggylerTool_V2;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller_HomePage2 implements Initializable {
	
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
    	
    	open_recipient_record();
    	// UPDATE CODE TO LOAD SEPARATELY AND FOR REFRESH OF TABLE
    	
    }

    @FXML
    void action_RemoveRecipient(ActionEvent event) {
    	// ADD CODE FOR REMOVING SELECTED RECIPIENT FROM TABLE AND FOR REFRESH OF TABLE
    }
    
    @FXML
    void add_UpdateRecipient(ActionEvent event) {
    	
    	open_recipient_record();
    	// UPDATE CODE TO LOAD SEPARATELY WITH RECIPIENT SELECTED ON TABLE

    }

    @FXML
    void action_keyinvAddKeyword(ActionEvent event) throws IOException {
    	
    	open_keyword_record();
    	
    	// UPDATE CODE TO LOAD SEPARATELY AND FOR REFRESH OF TABLE
    	

    }

    @FXML
    void action_keyinvUpdateKeyword(ActionEvent event) throws IOException {
    	
    	open_keyword_record();
    	
    	// UPDATE CODE TO LOAD SEPARATELY AND FOR REFRESH OF TABLE
    	 
    }
    
    @FXML
    void action_keyinvRemoveKeyword(ActionEvent event) {
    	
    	// ADD CODE FOR REMOVING SELECTED KEYWORD FROM TABLE AND FOR REFRESH OF TABLE
    }
    
    @FXML
    void action_Logout(ActionEvent event) {
    	System.exit(0);
    }
    
   // FOR KEYWORD 
    
    private ObservableList<Keyword> listKeyword = FXCollections
			.observableArrayList(new Keyword("key1", "key1", "key1", "key1", "key1", "key1"));
    
    public ObservableList<Keyword> dataBaseArrayList(ResultSet resultSet) throws SQLException {
    	ObservableList<Keyword> data = FXCollections.observableArrayList();
    	while(resultSet.next()) {
    		Keyword keyTemp = new Keyword();
    		keyTemp.setKeyword(resultSet.getString("keyword"));
    		keyTemp.setKeywordID("keywordid");
    		keyTemp.setPriorityRating("priorityrating");
    		keyTemp.setControlStd("controlstandardid");
    		keyTemp.setDateModified("datemodified");
    		keyTemp.setStatus("status");
    		data.add(keyTemp);
    	}
    	return data;
    }
    
    
    public ResultSet loadDataKeyword() {
    	SQLhelper sqlHelper = new SQLhelper("Database_RT.db"); 
		Connection conn = sqlHelper.getConnection();
		ResultSet tempSet = null;
		try {
		PreparedStatement preparedStatement = conn.prepareStatement("SELECT keyword, keywordid, priorityrating, controlstandardid,datemodified, status FROM keywordinventory");
		ResultSet resultSet = preparedStatement.executeQuery();
		tempSet = resultSet;
		
		} catch (SQLException e) {
            e.printStackTrace();
        }
		sqlHelper.closeConnection(conn);
		
		return tempSet;
    }
    
    ResultSet setKeyword = loadDataKeyword();
    
//    private ObservableList<Keyword> list = FXCollections.observableArrayList(dataBaseArrayList(setKeyword));
    
    //FOR RECIPIENT
    
    private ObservableList<Recipient> listRecipient= FXCollections
			.observableArrayList(new Recipient("Paulo", "Test", "Active"));
    
    //FOR SEARCH
    
    private ObservableList<Search> listSearch = FXCollections
			.observableArrayList(new Search("123","testkey","SEC","5/1/2022","Proposed Rule","321","www.sec.gov","4/30/2022"));
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//Keyword Table
		column_invKeyword.setCellValueFactory(new PropertyValueFactory<Keyword, String>("keyword"));
		column_invKeywordID.setCellValueFactory(new PropertyValueFactory<Keyword, String>("keywordID"));
		column_invDateModified.setCellValueFactory(new PropertyValueFactory<Keyword, String>("dateModified"));
		column_invControlStandardID.setCellValueFactory(new PropertyValueFactory<Keyword, String>("controlStd"));
		column_invPriorityRating.setCellValueFactory(new PropertyValueFactory<Keyword, String>("priorityRating"));
		column_invStatus.setCellValueFactory(new PropertyValueFactory<Keyword, String>("status"));
		
		table_Keyword.setItems(listKeyword);

		table_Keyword.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
		    if (newSelection != null) {
		        System.out.println("test lang");
		    }
		});
			
		
		//Recipient Table
		column_nameRecipient.setCellValueFactory(new PropertyValueFactory<Recipient, String>("recipientName"));
		column_emailRecipient.setCellValueFactory(new PropertyValueFactory<Recipient, String>("recipientEmail"));
		column_statusRecipient.setCellValueFactory(new PropertyValueFactory<Recipient, String>("recipientStatus"));
		
		
		table_Recipient.setItems(listRecipient);
		
		table_Recipient.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
		    if (newSelection != null) {
		        System.out.println("test lang");
		    }
		});
				
		//Search Table
		column_searchID.setCellValueFactory(new PropertyValueFactory<Search, String>("searchID"));
		column_searchKeyword.setCellValueFactory(new PropertyValueFactory<Search, String>("searchKeyword"));
		column_searchType.setCellValueFactory(new PropertyValueFactory<Search, String>("searchType"));
		column_searchDateIdentified.setCellValueFactory(new PropertyValueFactory<Search, String>("searchDateIdentified"));
		column_searchTitle.setCellValueFactory(new PropertyValueFactory<Search, String>("searchTitle"));
		column_SerialNumber.setCellValueFactory(new PropertyValueFactory<Search, String>("searchSerialNumb"));
		column_Link.setCellValueFactory(new PropertyValueFactory<Search, String>("searchLink"));
		column_PublicationDate.setCellValueFactory(new PropertyValueFactory<Search, String>("searchPubDate"));
		
		table_Search.setItems(listSearch);
		
		table_Search.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
		    if (newSelection != null) {
		        System.out.println("test lang");
		    }
		});
		
	}
	
	public void open_keyword_record() {
    	try {
	    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Record_Keyword.fxml"));
	    	AnchorPane root = (AnchorPane) fxmlLoader.load();
	        Stage stage = new Stage();
	        stage.setScene(new Scene(root));  
	        stage.show();

	    } catch(Exception e) {
	       e.printStackTrace();
	      }		
	}
	
	public void open_recipient_record() {
    	try {
	    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Record_NotificationRecipient.fxml"));
	    	AnchorPane root = (AnchorPane) fxmlLoader.load();
	        Stage stage = new Stage();
	        stage.setScene(new Scene(root));  
	        stage.show();

	    } catch(Exception e) {
	       e.printStackTrace();
	      }		
	}

}
