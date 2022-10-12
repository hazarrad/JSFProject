package com.dao.client;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.client.Client;
import com.database.util.DBUtils;
import com.mysql.fabric.xmlrpc.base.Array;

public class DaoClient {

	public static ArrayList<Client> getAllClient() throws Exception {

		ArrayList<Client> cls = new ArrayList<>();
		ResultSet r = DBUtils.executeRequete("select * from client");
		Client c;

		while (r.next()) {
			c = new Client();
			c.setIdClient(r.getInt(1));
			c.setNom(r.getString(2));
			c.setPrenom(r.getString(3));
			c.setDatenaissance(r.getString(4));
			c.setAdresse(r.getString(5));
			c.setCodepostal(r.getInt(6));
			c.setVille(r.getString(7));
			c.setPays(r.getString(8));
			c.setTelephone(r.getInt(9));
			c.setEmail(r.getString(10));

			cls.add(c);

		}
		return cls;

	}

	public static Client getoneProduit(int id) throws Exception {

		String sql = "select * from client where idclient =" + id;

		ResultSet r = DBUtils.executeRequete(sql);
		Client c = null;

		while (r.next()) {
			c = new Client();
			c.setIdClient(r.getInt(1));
			c.setNom(r.getString(2));
			c.setPrenom(r.getString(3));
			c.setDatenaissance(r.getString(4));
			c.setAdresse(r.getString(5));
			c.setCodepostal(r.getInt(6));
			c.setVille(r.getString(7));
			c.setPays(r.getString(8));
			c.setTelephone(r.getInt(9));
			c.setEmail(r.getString(10));
		}
		return c;

	}

	
	
	
	public static ArrayList<Integer> getAllCodeClient(String s) throws Exception{
		ArrayList<Integer> codes = new ArrayList<>();
		String sql = "SELECT * FROM client where idclient="+s;
	
		ResultSet r = DBUtils.executeRequete(sql);
		
		while(r.next()) {
			codes.add(r.getInt(1));
		}
		return codes;
		
	}
	
	public static int AddClient(Client c) throws Exception {
		String sql = "insert into client(nom,prenom,Datenaissance,Adresse,Codepostal,Ville,pays,Telephone,email) VALUES('"
				+ c.getNom() + "','" + c.getPrenom() + "','" + c.getDatenaissance() + "','" + c.getAdresse() + "',"
				+ c.getCodepostal() + ",'" + c.getVille() + "','" + c.getPays() + "'," + c.getTelephone() + ",'"
				+ c.getEmail() + "' )";

		return DBUtils.executeRequeteLMD(sql);

	}

	public static int UpdateClientInfo(){
		//String sql="Update client"+"set nom ="+;
		
		return 0;
		
	}
	
	public static int RemoveClient(int id) throws Exception {

		String sql = "delete from client where idclient= " + id;
		return DBUtils.executeRequeteLMD(sql);

	}

}
