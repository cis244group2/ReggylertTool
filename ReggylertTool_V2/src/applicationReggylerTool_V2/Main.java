package applicationReggylerTool_V2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {

			FXMLLoader loader = this.loadFxml("User_Login.fxml");
			AnchorPane root = (AnchorPane) loader.load();
			
			// follow format callback here
			Controller_User_Login login_ctl = loader.getController();
			login_ctl.setCallback(new CallBack() {

				@Override
				public void handle(String text, ActionEvent ae) {
					System.out.println("text: " + text);
					System.out.println("get email via controller: " + login_ctl.getUsername());
				}
			});

			Scene scene = new Scene(root, 574, 258);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Reggylert");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	FXMLLoader loadFxml(String filename) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(filename));
		return loader;
	}

//	public static ArrayList<SecDocData> doc_search(String keyword) {
//		
//		String sql = "SELECT publication, link, note FROM sec_doc_data WHERE publication LIKE '%" + keyword + "%';";
//		ArrayList<SecDocData> al = get_sql_results(sql); 
//		return al;
//	}
//
//	public static ArrayList<SecDocData> get_sql_results(String sql) {
//		SQLhelper sqlHelper = new SQLhelper("Database_RT.db");
//		Connection conn = sqlHelper.getConnection();
//
//		ResultSet rs = sqlHelper.executeQuery(conn, sql);
//
//		ArrayList<SecDocData> al = new ArrayList<SecDocData>();
//		try {
//			while (rs.next()) {
//				SecDocData sdd = new SecDocData( rs.getString("publication")
//												, rs.getString("link")
//												, rs.getString("note")
//												);
//				al.add(sdd);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		sqlHelper.closeConnection(conn);
//
//		return al;
//	}
//
//	public static void main(String[] args) {
//		
//		ArrayList<SecDocData> results = doc_search("13f-2");
//		for (SecDocData result : results) {
//			System.out.println("publication: " + result.getPublication());
//			System.out.println("link: " + result.getLink());
//			System.out.println("note: " + result.getNote());
//		}
//		launch(args);
//	}

}

