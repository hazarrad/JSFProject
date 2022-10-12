package com.vol.dao;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.database.utils.DBUtils;
import com.vol.entities.Pilote;
import com.vol.entities.Vol;

public class DaoPilote {

	public static ArrayList<Pilote> getAll() throws Exception{
		ArrayList<Pilote> pilotes = new ArrayList<>();
		String sql = "SELECT * FROM PILOTE";
		
		ResultSet res = DBUtils.executeRequete(sql);
		
		while(res.next()) {
			Pilote p = new Pilote();
			
			p.setId(res.getInt(1));
			p.setNom(res.getString(2));
			p.setPrenom(res.getString(3));
			p.setAdresse(res.getString(4));
			p.setTel(res.getString(5));
			p.setDateEmbauche(res.getDate(6));
			p.setDateEmbauche(res.getDate(7));
			
			pilotes.add(p);
		}
		
		return pilotes;
	}
	
	public static ArrayList<Vol> getAllVols(int idPilote) throws Exception{
		ArrayList<Vol> vols = new ArrayList<>();
		
		String sql = "SELECT * FROM VOL where idpilote="+idPilote;
		
		ResultSet res = DBUtils.executeRequete(sql);
		
		while(res.next()) {
			Vol v = new Vol();
			
			v.setId(res.getInt(1));
			v.setDateVol(res.getDate(2));
			v.setHeureDecalage(res.getInt(3));
			v.setMinuteDecalage(res.getInt(4));
			v.setIdPilote(res.getInt(5));
			v.setIdAvion(res.getInt(6));
			v.setIdTrajet(res.getInt(7));
			
			vols.add(v);			
		}
		return vols;
	}
	
	public static Pilote getOne(int idPilote) throws Exception{
		
		String sql = "SELECT * FROM PILOTE WHERE idpilote="+idPilote;
		
		Pilote p = null;
		ResultSet res = DBUtils.executeRequete(sql);
		
		if(res.next()) {
			
			p= new Pilote();
			p.setId(res.getInt(1));
			p.setNom(res.getString(2));
			p.setPrenom(res.getString(3));
			p.setAdresse(res.getString(4));
			p.setTel(res.getString(5));
			p.setDateEmbauche(res.getDate(6));
			p.setDateEmbauche(res.getDate(7));
		}
		
		return p;
	}
	
	public static int add(Pilote pilote) throws Exception {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		
		String sql = "insert into pilote(Nom,prenom,adresse,tel,DATENAISSANCE,DATEEMBAUCHE)\r\n" + 
				"  values ('"+pilote.getNom()+"','"+pilote.getPrenom()+"','"+pilote.getAdresse()+"','"+pilote.getTel()+"','"+format.format(pilote.getDateNaissance())+"','"+format.format(pilote.getDateEmbauche())+"')" ; 
		
		return DBUtils.executeRequeteLMD(sql);
	}
	public static int update(Pilote pilote) throws Exception {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		
		String sql = "update pilote" + 
				"  set nom = '"+pilote.getNom()+"'," + 
				"  	prenom = '"+pilote.getPrenom()+"'," + 
				"  	adresse = '"+pilote.getAdresse()+"'," + 
				"  	TEL = '"+pilote.getTel()+"'," + 
				"  	DATENAISSANCE = '"+format.format(pilote.getDateNaissance())+"'," + 
				"  	DATEEMBAUCHE = '"+format.format(pilote.getDateEmbauche())+"'" + 
				"  where idPilote = " + pilote.getId();
		return DBUtils.executeRequeteLMD(sql);
	}
	public static int remove(int idpilote) throws Exception {
		
		String sql = "delete from pilote where idpilote="+idpilote;
		return DBUtils.executeRequeteLMD(sql);
	}
}
