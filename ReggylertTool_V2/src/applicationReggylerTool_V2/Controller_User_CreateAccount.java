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

public class Controller_User_CreateAccount {

	private Stage stage;
	private Scene scene;

	@FXML
	private Button button_userBackToLogin;

	@FXML
	private Label lbAlert;

	@FXML
	private Button button_userCreateAccount;

	@FXML
	private PasswordField field_userConfirmPassword;

	@FXML
	private TextField field_userEmail;

	@FXML
	private PasswordField field_userPassword;

	private CallBack callBack = null;

	private SQLhelper sqlHelper = new SQLhelper("Database_RT.db");

	public void setCallback(CallBack callBack) {
		this.callBack = callBack;
	}

	@FXML
	void action_userBackToLogin(ActionEvent event) throws IOException {
		gotoLoginPage(event);

	}

	void gotoLoginPage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("User_Login.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void action_userCreateAccount(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
		createUserAccount(event);
	}


	public void createUserAccount(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {

		String email = field_userEmail.getText().trim();
		String password1 = field_userPassword.getText();
		String confirmPassword1 = field_userConfirmPassword.getText();
		System.out.println(password1 + "  " + confirmPassword1);

		if (checkPassword(password1, confirmPassword1)) {
			Connection connection = this.sqlHelper.getConnection();
			PreparedStatement statement = connection.prepareStatement("insert into User( email, password) values( ?, ?)");
			
			statement.setString(1, email);
			statement.setString(2, password1);
			// Email.accountCreationEmail(email); //trigger account confirmation email

			statement.executeUpdate();
			this.sqlHelper.closeConnection(connection);
			gotoLoginPage(event);
		} 
		else {
			lbAlert.setText("Those passwords did not match. Please try again.");
			lbAlert.setTextFill(Color.RED);
		}
	}

	boolean checkPassword(String passWord, String confirmPassword) {
		return passWord.equals(confirmPassword);
	}

}
