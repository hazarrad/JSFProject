package com.jdbc.connection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBUtils {

	public static ResultSet execStatementQuery(String sql) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection conn = ConnexionManager.getInstance();
		
		Statement st = conn.createStatement();
		
		return st.executeQuery(sql);
	}
	
	public static int execStatementUpdate(String sql) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection conn = ConnexionManager.getInstance();
		
		Statement st = conn.createStatement();
		
		return st.executeUpdate(sql);
	}
}
