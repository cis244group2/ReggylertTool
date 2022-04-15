package applicationReggylerTool_V2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class Controller_Inventory_Keyword {

    @FXML
    private Button button_AddKeyword;

    @FXML
    private Button button_RemoveKeyword;

    @FXML
    private Button button_ReturnToHome;

    @FXML
    private Button button_UpdateKeyword;

    @FXML
    private TableColumn<?, ?> column_ControlStandardID;

    @FXML
    private TableColumn<?, ?> column_DateModified;

    @FXML
    private TableColumn<?, ?> column_Keyword;

    @FXML
    private TableColumn<?, ?> column_KeywordID;

    @FXML
    private TableColumn<?, ?> column_KeywordStatus;

    @FXML
    private TableColumn<?, ?> column_PriorityRating;

    @FXML
    void action_AddKeyword(ActionEvent event) {

    }

    @FXML
    void action_RemoveKeyword(ActionEvent event) {

    }

    @FXML
    void action_ReturnToHome(ActionEvent event) {
    	// for test
    	try {
			 FXMLLoader fxmlLoader = new FXMLLoader();
			 fxmlLoader.setLocation(getClass().getResource("Inventory_Search.fxml"));
			 Scene scene = new Scene(fxmlLoader.load(), 945, 742);
			 Stage stage = new Stage();
			 stage.setTitle("test");
			 stage.setScene(scene);
			 stage.show();

			} catch(Exception e) {
				e.printStackTrace();
			}

    }

    @FXML
    void action_UpdateKeyword(ActionEvent event) {

    }

}
