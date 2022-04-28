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

public class Controller_User_Login {

	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	private Button button_loginCreateAccount;

	@FXML
	private Label lbConfirm;

	@FXML
	private Button button_loginLogin;

	@FXML
	private TextField field_loginEmail;

	@FXML
	private PasswordField field_loginPassword;

	private CallBack callBack = null;
	
	public void setCallback(CallBack callBack) {
		this.callBack = callBack;
	}

	@FXML
	void action_loginCreateAccount(ActionEvent event) throws IOException {
				
		Parent root = FXMLLoader.load(getClass().getResource("User_CreateAccount.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void action_loginLogin(ActionEvent event)
			throws IOException, ClassNotFoundException, SQLException, InterruptedException {
		loginUser(event);
	}

	public void loginUser(ActionEvent event)
			throws SQLException, IOException, ClassNotFoundException, InterruptedException {
		// Execute a statement
		SQLhelper sqlHelper = new SQLhelper("Database_RT.db");
		Connection connection =sqlHelper.getConnection();
		
		PreparedStatement statementLoging= connection.prepareStatement("select email, password from User where email = ? and password = ?");


		String email = field_loginEmail.getText().trim();
		String password = field_loginPassword.getText().trim();
		statementLoging.setString(1, email);
		statementLoging.setString(2, password);

		ResultSet rst = statementLoging.executeQuery();
		
		if (rst.next()) {
			loadHomepage(rst.getString(1), event);
		} else {
			lbConfirm.setTextFill(Color.RED);
			lbConfirm.setText("Your login credentials are incorrect. Please try again.");
		}
		
		if(this.callBack != null) {
			this.callBack.handle(email, event);
		}
		sqlHelper.closeConnection(connection);
	}

	void loadHomepage(String name, ActionEvent event) throws IOException {
	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage2_RT.fxml"));
		root = loader.load();
		Controller_HomePage2 userProfile = loader.getController();
		userProfile.setUsername(name);
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

	public String getUsername() {
		return this.field_loginEmail.getText();
	}
	
	FXMLLoader loadFxml(String filename) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(filename));
		return loader;
	}
	
	

}
