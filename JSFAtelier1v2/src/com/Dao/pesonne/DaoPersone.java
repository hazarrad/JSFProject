package com.Dao.pesonne;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.jdbc.connection.DBUtils;
import com.personne.info.personne;



public class DaoPersone {
	
	
	
	public static ArrayList<personne> getonepersonne(String cin) throws Exception{
		ArrayList<personne> p=new ArrayList<>();
		String sql="Select * from personne where cin="+cin;
		ResultSet rs=DBUtils.execStatementQuery(sql);
		
		while(rs.next()) {
			
			personne pes=new personne();
			pes.setCIN(rs.getString(1));
			pes.setNOM(rs.getString(2));
			pes.setPRENOM(rs.getString(3));
			pes.setSEXE(rs.getString(4));

			
			p.add(pes);
		}
		
		return p;
		
	}
	
	
	public static int add(personne prs) throws Exception  {
		
		String sql="Insert into PERSONNE VALUES('"+prs.getCIN()+"','"+prs.getNOM()+"','"+prs.getPRENOM()+"','"+prs.getSEXE()+"')";
		return DBUtils.execStatementUpdate(sql);
		
	}

}
