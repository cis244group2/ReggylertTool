package applicationReggylerTool_V2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller_User_Profile {

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
    void action_profileReturnHome(ActionEvent event) {
    	
    	Stage primaryStage = (Stage) button_profileReturnHome.getScene().getWindow();
    	
    	try {
			 
			 FXMLLoader fxmlLoader = new FXMLLoader();
			 fxmlLoader.setLocation(getClass().getResource("HomePage_RT.fxml"));
			 Scene scene = new Scene(fxmlLoader.load(), 813, 678);
			 Stage stage = new Stage();
			 stage.setTitle("Home Page");
			 stage.setScene(scene);
			 
			 stage.setOnHidden(e -> primaryStage.show());
			 
			 stage.show();
			 
			 primaryStage.hide();

			} catch(Exception e) {
				e.printStackTrace();
			}
    	
       }

}
