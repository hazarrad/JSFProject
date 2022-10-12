package com.vol.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.database.utils.DBUtils;
import com.vol.entities.Avion;
import com.vol.entities.Vol;

public class DaoAvion {

	public static ArrayList<Avion> getAll() throws Exception{
		ArrayList<Avion> avions = new ArrayList<>();
		String sql = "SELECT * FROM AVION";
		
		ResultSet res = DBUtils.executeRequete(sql);
		
		while(res.next()) {
			Avion p = new Avion();
			
			p.setId(res.getInt(1));
			p.setCompagnie(res.getString(2));
			p.setType(res.getString(3));
			p.setDateMiseMarche(res.getDate(4));
			
			avions.add(p);
		}
		
		return avions;
	}
	
	public static ArrayList<Vol> getAllVols(int idAvion) throws Exception{
		ArrayList<Vol> vols = new ArrayList<>();
		
		String sql = "SELECT * FROM VOL where idavion="+idAvion;
		
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
	
	public static Avion getOne(int idAvion) throws Exception{
		String sql = "SELECT * FROM AVION WHERE idAvion="+idAvion;
		
		Avion av = null;
		ResultSet res = DBUtils.executeRequete(sql);
		
		if(res.next()) {
			
			av = new Avion();
			av.setId(res.getInt(1));
			av.setCompagnie(res.getString(2));
			av.setType(res.getString(3));
			av.setDateMiseMarche(res.getDate(4));	
		}
		
		return av;
	}
	
	public int add(Avion avion) {
		return 0;
	}
	
	public int update(Avion avion) {
		return 0;
	}
	
	public int remove(int idAvion) throws Exception {
		String sql = "delete from Avion where idavion="+idAvion;
		return DBUtils.executeRequeteLMD(sql);
	}
	
}
