package com.MangerCar.Dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ManagerCar.utils.HibernateUtile;
import com.MangerCar.Entity.Marque;
import com.jdbc.connection.DBUtils;

public class DaoMaruqe {


	

	public static ArrayList<Marque> getAllMarque() throws Exception{
		ArrayList<Marque> p=new ArrayList<>();
		String sql="Select * from marque";
		ResultSet rs=DBUtils.execStatementQuery(sql);
		
		while(rs.next()) {
			
			Marque m=new Marque();
			m.setCode(rs.getInt(1));
			m.setLibelle(rs.getString(2));

			
			p.add(m);
		}
		
		return p;
		
	}
	
	
	public static int AddMarque(Marque p) throws Exception  {
		
		String sql="Insert into marque VALUES("+p.getCode()+",'"+p.getLibelle()+"')";
		return DBUtils.execStatementUpdate(sql);
		
	}
}
