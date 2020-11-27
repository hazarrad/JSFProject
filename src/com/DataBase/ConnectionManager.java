package com.DataBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {

	private ConnectionManager(){}
	
	static Connection conn=null;
	
	public static Connection getInstance() throws Exception {
		
		if(conn==null)
		{
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			
			Properties p = new Properties();
			p.load(classLoader.getResourceAsStream("/com/DataBase/db.properties"));
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String url=p.getProperty("url");
			String user=p.getProperty("user");
			String pwd=p.getProperty("pwd");
			
			conn=DriverManager.getConnection(url, user, pwd);
			
		}
		
		return conn;
	}
	
	
	
}
