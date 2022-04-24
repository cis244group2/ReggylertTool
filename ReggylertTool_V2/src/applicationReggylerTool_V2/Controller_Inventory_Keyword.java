package applicationReggylerTool_V2;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Controller_Inventory_Keyword implements Initializable {

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
    private TableColumn<Keyword, String> column_ControlStandardID;

    @FXML
    private TableColumn<Keyword, String> column_DateModified;

    @FXML
    private TableColumn<Keyword, String> column_Keyword;

    @FXML
    private TableColumn<Keyword, String> column_KeywordID;

    @FXML
    private TableColumn<Keyword, String> column_KeywordStatus;

    @FXML
    private TableColumn<Keyword, String> column_PriorityRating;
    
    @FXML
    private TableView<Keyword> table_Keyword;
    
    private CallBack callBack = null;
	
	public void setCallback(CallBack callBack) {
		this.callBack = callBack;
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
    void action_keyinvReturnToHome(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("HomePage_RT.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    
//    String sqlKeywords = "SELECT id, keyword, keywordid, priorityrating, controlstandardid, datemodified, status FROM keywordinventory;";
    
	public static ArrayList<Keyword> load_keywords(String sql) {
//		String sql = "SELECT publication, link, note FROM sec_doc_data WHERE publication LIKE '%" + keyword + "%';";
		ArrayList<Keyword> al = get_sql_results(sql); 
		return al;
	}

	public static ArrayList<Keyword> get_sql_results(String sql) {
		SQLhelper sqlHelper = new SQLhelper("Database_RT.db");
		Connection conn = sqlHelper.getConnection();

		ResultSet rs = sqlHelper.executeQuery(conn, sql);

		ArrayList<Keyword> al = new ArrayList<Keyword>();
		try {
			while (rs.next()) {
				Keyword sdd = new Keyword( rs.getString("keyword")
												, rs.getString("keywordid")
												, rs.getString("priorityrating")
												, rs.getString("controlstandardid")
												, rs.getString("datemodified")
												, rs.getString("status")
												);
				al.add(sdd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		sqlHelper.closeConnection(conn);

		return al;
	}
	
	String sqlKeywords = "SELECT keyword, keywordid, priorityrating, controlstandardid, datemodified, status FROM keywordinventory;";
	ObservableList<Keyword> list = FXCollections.observableArrayList(get_sql_results(sqlKeywords));
	

	@Override
	public void initialize(URL url, ResourceBundle resourcebundle) {
		column_Keyword.setCellValueFactory(new PropertyValueFactory<Keyword, String>(""));
		column_KeywordID.setCellValueFactory(new PropertyValueFactory<Keyword, String>(""));
		column_PriorityRating.setCellValueFactory(new PropertyValueFactory<Keyword, String>(""));
		column_ControlStandardID.setCellValueFactory(new PropertyValueFactory<Keyword, String>(""));
		column_DateModified.setCellValueFactory(new PropertyValueFactory<Keyword, String>(""));
		column_KeywordStatus.setCellValueFactory(new PropertyValueFactory<Keyword, String>(""));
		
		table_Keyword.setItems(list);
		printtab();
	}
	
	void printtab() {
		System.out.println(String.valueOf(list));
	}
	
    
    
}	
