package com.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.Beans.Client;
import com.DataBase.dbUtils;

public class DaoClient {
	
public static ArrayList<Client> getAllClient() throws Exception{
	ArrayList<Client> client= new ArrayList<>();
	ResultSet r=dbUtils.ExecuteSelect("select * from client");
	while(r.next()) {
		client.add(new Client(r.getInt(1),r.getString(2),r.getString(3),r.getString(4)));
		}
		return client;
	}
public static int addClient(Client c) throws Exception {
	int i = dbUtils.ExecuteUpdate("insert into client values ("+c.getCodeClient()+",'"+c.getNomClient()+"','"+c.getPrenomClient()+"','"+c.getAdresse()+"')");
	return i;
}
public static int deleteClient(int codeClient) throws Exception {
	int i= dbUtils.ExecuteUpdate("delete from client where codeClient="+codeClient);
	return i;
}
public static int updateClient(Client c) throws Exception {
int i=dbUtils.ExecuteUpdate("update Client set nomClient='"+c.getNomClient()+"', prenomClient='"+c.getPrenomClient()+"', adresse='"+c.getAdresse()+"' where codeClient="+c.getCodeClient());
return i;
}
}

