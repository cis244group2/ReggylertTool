package applicationReggylerTool_V2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller_User_Profile {
	
	private Stage stage;
	private Scene scene;
	private Parent root;

    @FXML
    private Button button_profileReturnHome;

    @FXML
    private TextField field_profileCompany;

    @FXML
    private TextField field_profileDateAccountCreated;

    @FXML
    private TextField field_profileEmail;

    @FXML
    private TextField field_profileName;

    @FXML
    void action_profileReturnHome(ActionEvent event) throws IOException {
    	
    	Parent root = FXMLLoader.load(getClass().getResource("HomePage_RT.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    	
       }

}
