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

public class Controller_Record_Keyword {
	
	private Stage stage;
	private Scene scene;

    @FXML
    private Button button_SubmitKeyword;

    @FXML
    private TextField field_ControlStandardID;

    @FXML
    private TextField field_DateModified;

    @FXML
    private TextField field_Keyword;

    @FXML
    private TextField field_KeywordID;

    @FXML
    private TextField field_KeywordStatus;

    @FXML
    private TextField field_PriorityTierRating;

    @FXML
    void action_SubmitKeyword(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Inventory_Keyword.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }

}
