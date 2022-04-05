package applicationReggylerTool_V2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SQLhelper {
	private String dbname = "";

	public SQLhelper(String dbname) {
		this.dbname = dbname;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			String url = "jdbc:sqlite:" + this.getResource(this.dbname);

			conn = DriverManager.getConnection(url);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}
	
	public void closeConnection(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void execute(String sql) throws SQLException {
		Connection conn = null;
		try {
			conn = this.getConnection();
			Statement stmt = conn.createStatement();

			stmt.execute(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	}

	public ResultSet executeQuery(Connection conn, String sql) {

		ResultSet rs = null;
		try {
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return rs;
	}

	public ArrayList<String> getColumnNames(ResultSet rs) {
		ArrayList<String> al = new ArrayList<String>();

		try {

			ResultSetMetaData rsMetaData;
			rsMetaData = rs.getMetaData();

			// Retrieving the list of column names
			int count = rsMetaData.getColumnCount();
			for (int i = 1; i <= count; i++) {
				al.add(rsMetaData.getColumnName(i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return al;
	}

	private String getResource(String resource) {
		return getClass().getResource(resource).toString();
	}
}
