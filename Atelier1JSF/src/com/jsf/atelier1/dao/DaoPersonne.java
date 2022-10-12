package com.jsf.atelier1.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.connection.DBUtils;
import com.jsf.atelier1.model.Personne;

public class DaoPersonne {

	public static List<Personne> getAllPersonne() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{
		ArrayList<Personne> pers = new ArrayList<>();
		
		String sql = "select * from personne";
		ResultSet rst = DBUtils.execStatementQuery(sql);
		
		while(rst.next()) {
			Personne p = new Personne();
			p.setCin(rst.getString(1));
			p.setNom(rst.getString(2));
			p.setPrenom(rst.getString(3));
			p.setSexe(rst.getString(4));
			
			pers.add(p);
		}
		
		return pers;
	}
	
	public static Personne getOnePersonne(String cin) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		String sql = "select * from personne where cin = '"+cin+"'";
		ResultSet rst = DBUtils.execStatementQuery(sql);
		
		if(rst.next()) {
			Personne p = new Personne();
			p.setCin(rst.getString(1));
			p.setNom(rst.getString(2));
			p.setPrenom(rst.getString(3));
			p.setSexe(rst.getString(4));
			
			return p;
		}
		
		return null;
	}
	
	public static void Save(Personne p) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		String sql = "insert into personne(cin,nom,prenom,sexe) values ('"+p.getCin()+"','"+p.getNom()+"','"+p.getPrenom()+"','"+p.getSexe()+"')";
		
		DBUtils.execStatementUpdate(sql);
	}
}
