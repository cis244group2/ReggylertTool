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

public class Controller_Inventory_NotificationSettings {
	
	private Stage stage;
	private Scene scene;
	
    @FXML
    private Button button_AddNewRecipient;

    @FXML
    private Button button_RemoveRecipient;

    @FXML
    private Button button_UpdateRecipient;

    @FXML
    private Button button_notsetReturnHome;

    @FXML
    private TableColumn<?, ?> column_RecipientEmail;

    @FXML
    private TableColumn<?, ?> column_RecipientName;

    @FXML
    private TableColumn<?, ?> column_RecipientStatus;

    @FXML
    void action_AddNewRecipient(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Record_NotificationRecipient.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show(); 
    }

    @FXML
    void action_RemoveRecipient(ActionEvent event) {

    }

    @FXML
    void action_notsetReturnHome(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("HomePage_RT.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

    }

    @FXML
    void add_UpdateRecipient(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Record_NotificationRecipient.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
}
