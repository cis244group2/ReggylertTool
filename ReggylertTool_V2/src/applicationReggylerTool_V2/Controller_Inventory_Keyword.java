package applicationReggylerTool_V2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class Controller_Inventory_Keyword {

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
    void action_keyinvAddKeyword(ActionEvent event) {

    }

    @FXML
    void action_keyinvkeyinvRemoveKeyword(ActionEvent event) {

    }
    
    @FXML
    void action_keyinvUpdateKeyword(ActionEvent event) {

    }
    

    @FXML
    void action_keyinvReturnToHome(ActionEvent event) {
    	
    	
    	Stage primaryStage = (Stage) button_keyinvReturnToHome.getScene().getWindow();
    	
    	try {
			 
			 FXMLLoader fxmlLoader = new FXMLLoader();
			 fxmlLoader.setLocation(getClass().getResource("HomePage_RT.fxml"));
			 Scene scene = new Scene(fxmlLoader.load(), 813, 678);
			 Stage stage = new Stage();
			 stage.setTitle("Keyword Inventory");
			 stage.setScene(scene);
			 
			 stage.setOnHidden(e -> primaryStage.show());
			 
			 stage.show();
			 
			 primaryStage.hide();

			} catch(Exception e) {
				e.printStackTrace();
			}
    	
    }
}
