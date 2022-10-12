package com.jdbc.connection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnexionManager {

	private static Connection conn=null;
	
	private ConnexionManager() {
		
	}
	
	public static Connection getInstance() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		if(conn==null) {
			
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			
			Properties prop = new Properties();
			prop.load(classLoader.getResourceAsStream("/com/jdbc/connection/db.properties"));
			
			Class.forName(prop.getProperty("driver"));
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String pwd=prop.getProperty("pwd");
			
			conn = DriverManager.getConnection(url, user, pwd);

		}
		
		return conn;
		
	}
	
	
}
