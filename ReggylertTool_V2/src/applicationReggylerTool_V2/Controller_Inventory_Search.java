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

public class Controller_Inventory_Search {
	
	private Stage stage;
	private Scene scene;

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
    void action_ReturnToHome(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("HomePage_RT.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }

}
