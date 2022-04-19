package applicationReggylerTool_V2;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("View_1_Initial.fxml"));
			Scene scene = new Scene(root,755,565);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	 @FXML
	 private Button button_OpenRT;

	 @FXML
	 void action_OpenRT(ActionEvent event) {
		 
		 try {
			 
			 FXMLLoader fxmlLoader = new FXMLLoader();
			 fxmlLoader.setLocation(getClass().getResource("HomePage_RT.fxml"));
			 Scene scene = new Scene(fxmlLoader.load(), 813, 678);
			 Stage stage = new Stage();
			 stage.setTitle("Keyword Inventory");
			 stage.setScene(scene);
			 stage.show();

			} catch(Exception e) {
				e.printStackTrace();
			}
	    }
	
}
