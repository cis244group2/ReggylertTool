package applicationReggylerTool_V2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class Controller_Inventory_NotificationSettings {
	
	@FXML
    private Button button_AddNewRecipient;

    @FXML
    private Button button_RemoveRecipient;

    @FXML
    private Button button_ReturnHome;

    @FXML
    private Button button_UpdateRecipient;

    @FXML
    private TableColumn<?, ?> column_RecipientEmail;

    @FXML
    private TableColumn<?, ?> column_RecipientName;

    @FXML
    private TableColumn<?, ?> column_RecipientStatus;

    @FXML
    void action_AddNewRecipient(ActionEvent event) {

    }

    @FXML
    void action_RemoveRecipient(ActionEvent event) {
    	
    }
    
    @FXML
    void add_UpdateRecipient(ActionEvent event) {

    }

    @FXML
    void action_ReturnHome(ActionEvent event) {
    	
    	Stage primaryStage = (Stage) button_ReturnHome.getScene().getWindow();
    	
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
