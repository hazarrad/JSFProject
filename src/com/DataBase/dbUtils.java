package com.DataBase;

import java.sql.Statement;
import java.sql.ResultSet;

public class dbUtils {

	public static ResultSet ExecuteSelect(String sql) throws Exception {
		
		Statement st=ConnectionManager.getInstance().createStatement();
		ResultSet rs =st.executeQuery(sql);
		return rs;
	}
	
public static int ExecuteUpdate(String sql) throws Exception {
		
		Statement st=ConnectionManager.getInstance().createStatement();
		int nb =st.executeUpdate(sql);
		return nb;
	}
	

}
