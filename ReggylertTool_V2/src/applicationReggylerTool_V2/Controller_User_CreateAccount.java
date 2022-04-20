package applicationReggylerTool_V2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller_User_CreateAccount {

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
    void action_userBackToLogin(ActionEvent event) {
    	
    	Stage primaryStage = (Stage) button_userBackToLogin.getScene().getWindow();
    	
    	try {
			 
			 FXMLLoader fxmlLoader = new FXMLLoader();
			 fxmlLoader.setLocation(getClass().getResource("User_Login.fxml"));
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

    @FXML
    void action_userCreateAccount(ActionEvent event) {
    	
    	

    }

}
