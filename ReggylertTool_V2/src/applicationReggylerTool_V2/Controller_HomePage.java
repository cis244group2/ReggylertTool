package applicationReggylerTool_V2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller_HomePage {

    @FXML
    private Button button_homeAccountSettings;

    @FXML
    private Button button_homeKeywordInventory;

    @FXML
    private Button button_homeLogout;

    @FXML
    private Button button_homeNotificationSettings;

    @FXML
    private Button button_homeSearchSummary;

    @FXML
    private Label field_homeUserName;

    @FXML
    void action_homeAccountSettings(ActionEvent event) {
    	
    	Stage primaryStage = (Stage) button_homeAccountSettings.getScene().getWindow();
    	
    	try {
			 
			 FXMLLoader fxmlLoader = new FXMLLoader();
			 fxmlLoader.setLocation(getClass().getResource("User_Profile.fxml"));
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
    void action_homeKeywordInventory(ActionEvent event) {
    	
    	Stage primaryStage = (Stage) button_homeKeywordInventory.getScene().getWindow();
    	
    	try {
			 
			 FXMLLoader fxmlLoader = new FXMLLoader();
			 fxmlLoader.setLocation(getClass().getResource("Inventory_Keyword.fxml"));
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
    void action_homeLogout(ActionEvent event) {
    	
    	System.exit(0);

    }

    @FXML
    void action_homeNotificationSettings(ActionEvent event) {
    	//does not work
    	try {
			 
			 FXMLLoader fxmlLoader = new FXMLLoader();
			 fxmlLoader.setLocation(getClass().getResource("Inventory_NotificationSettings.fxml"));
			 Scene scene = new Scene(fxmlLoader.load(), 767, 1057);
			 Stage stage = new Stage();
			 stage.setTitle("Keyword Inventory");
			 stage.setScene(scene);
			 stage.show();

			} catch(Exception e) {
				e.printStackTrace();
			}

    }

    @FXML
    void action_homeSearchSummary(ActionEvent event) {
    	
    	
    	Stage primaryStage = (Stage) button_homeSearchSummary.getScene().getWindow();
    	
    	try {
			 
			 FXMLLoader fxmlLoader = new FXMLLoader();
			 fxmlLoader.setLocation(getClass().getResource("Inventory_Search.fxml"));
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
