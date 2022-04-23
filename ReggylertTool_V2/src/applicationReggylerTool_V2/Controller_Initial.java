package applicationReggylerTool_V2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.sql.*;

public class Controller_Initial {
	
    @FXML
	private Button button_OpenRT;

	@FXML
	void action_OpenRT(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("User_Login.fxml"));

	}
   

}
