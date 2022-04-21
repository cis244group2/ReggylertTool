package applicationReggylerTool_V2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller_User_CreateAccount {
	
	private Stage stage;
	private Scene scene;
	private Parent root;

    @FXML
    private Button button_userBackToLogin;

    @FXML
    private Button button_userCreateAccount;

    @FXML
    private PasswordField field_userConfirmPassword;

    @FXML
    private TextField field_userEmail;

    @FXML
    private PasswordField field_userPassword;

    @FXML
    void action_userBackToLogin(ActionEvent event) throws IOException {
    	
		Parent root = FXMLLoader.load(getClass().getResource("User_Login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }

    @FXML
    void action_userCreateAccount(ActionEvent event) {
    	
    	

    }

}
