package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTest {
	
	Connection con = null;
	Statement stmt = null;
	String databaseURL = "jdbc:mysql://localhost:3306/user";
	String user = "root";
	String password = "root";
	
	public void setUp() {
		String driver = "com.mysql.jdbc.driver";
		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(databaseURL, user, password);
			
			stmt = con.createStatement();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
	}

	public void dbTest() throws SQLException {
		String query = "Select * from databaseInfo";
		stmt.executeQuery(query);
	}
}
