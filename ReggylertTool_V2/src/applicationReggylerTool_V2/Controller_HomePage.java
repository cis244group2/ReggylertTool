//package applicationReggylerTool_V2;
//
//import java.io.IOException;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//public class Controller_HomePage {
//	
//	private Stage stage;
//	private Scene scene;
//
//    @FXML
//    private Button button_homeAccountSettings;
//
//    @FXML
//    private Button button_homeKeywordInventory;
//
//    @FXML
//    private Button button_homeLogout;
//
//    @FXML
//    private Button button_homeNotificationSettings;
//
//    @FXML
//    private Button button_homeSearchSummary;
//
//    @FXML
//    private Label field_homeUserName;
//    
//    @FXML
//    private Text username;
//
//
//    @FXML
//    void action_homeAccountSettings(ActionEvent event) throws IOException {
//		Parent root = FXMLLoader.load(getClass().getResource("User_Profile.fxml"));
//		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		stage.setScene(scene);
//		stage.show();
//    }
//    
//    public void setUsername(String name) {
//    	username.setText("Welcome " + name);
//    }
//
//    @FXML
//    void action_homeKeywordInventory(ActionEvent event) throws IOException {
//		Parent root = FXMLLoader.load(getClass().getResource("Inventory_Keyword.fxml"));
//		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		stage.setScene(scene);
//		stage.show();
//    }
//
//    @FXML
//    void action_homeLogout(ActionEvent event) {
//    	System.exit(0); // update this to correct way to close app
//    }
//
//    @FXML
//    void action_homeNotificationSettings(ActionEvent event) throws IOException {
//		Parent root = FXMLLoader.load(getClass().getResource("Inventory_Notification.fxml"));
//		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		stage.setScene(scene);
//		stage.show();
//    }
//
//    @FXML
//    void action_homeSearchSummary(ActionEvent event) throws IOException {
//		Parent root = FXMLLoader.load(getClass().getResource("Inventory_Search.fxml"));
//		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		stage.setScene(scene);
//		stage.show();
//
//    }
//}
