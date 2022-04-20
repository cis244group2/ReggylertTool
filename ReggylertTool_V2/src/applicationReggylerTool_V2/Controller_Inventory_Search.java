package applicationReggylerTool_V2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class Controller_Inventory_Search {

    @FXML
    private Button btn_ReturnToHome;

    @FXML
    private TableColumn<?, ?> column_DateIdentified;

    @FXML
    private TableColumn<?, ?> column_Keyword;

    @FXML
    private TableColumn<?, ?> column_Link;

    @FXML
    private TableColumn<?, ?> column_PublicationDate;

    @FXML
    private TableColumn<?, ?> column_SearchID;

    @FXML
    private TableColumn<?, ?> column_SerialNumber;

    @FXML
    private TableColumn<?, ?> column_Title;

    @FXML
    private TableColumn<?, ?> column_Type;

    @FXML
    void action_ReturnToHome(ActionEvent event) {
    	
    	Stage primaryStage = (Stage) btn_ReturnToHome.getScene().getWindow();
    	
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
