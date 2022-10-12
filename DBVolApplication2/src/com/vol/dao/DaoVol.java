package com.vol.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.database.utils.DBUtils;
import com.vol.entities.Avion;
import com.vol.entities.Pilote;
import com.vol.entities.Trajet;
import com.vol.entities.Vol;

public class DaoVol {

	public static ArrayList<Vol> getAll() throws Exception {
		ArrayList<Vol> vols = new ArrayList<>();
		String sql = "SELECT * FROM VOL";

		ResultSet res = DBUtils.executeRequete(sql);

		while (res.next()) {
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

	public static Vol getOne(int idVol) throws Exception {
		String sql = "SELECT * FROM VOL where idvol="+idVol;
		Vol v = null;
		ResultSet res = DBUtils.executeRequete(sql);

		if (res.next()) {
			v = new Vol();

			v.setId(res.getInt(1));
			v.setDateVol(res.getDate(2));
			v.setHeureDecalage(res.getInt(3));
			v.setMinuteDecalage(res.getInt(4));
			v.setIdPilote(res.getInt(5));
			v.setIdAvion(res.getInt(6));
			v.setIdTrajet(res.getInt(7));

		}
		return v;
	}
	
	public static Pilote getPilote(int idVol) throws Exception {
		String sql = "select p.* " + 
				" from vol v " + 
				"     inner join pilote p on v.idpilote = p.idpilote " + 
				" where v.idvol =" +idVol;
		
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

	public static Avion getAvion(int idVol) throws Exception {
		
		String sql = "select a.* " + 
				"from vol v " + 
				"     inner join avion a on v.idavion = a.idavion " + 
				"where v.idvol ="+idVol;
		
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
	
	public static Trajet getTrajet(int idVol) throws Exception {
		
		String sql="select t.* " + 
				"from vol v " + 
				"     inner join trajet t on v.idtrajet = t.idtrajet " + 
				"where v.idvol ="+idVol;
		Trajet t = null;
		ResultSet res = DBUtils.executeRequete(sql);

		if (res.next()) {
			t = new Trajet();

			t.setId(res.getInt(1));
			t.setAeroportDepart(res.getString(2));
			t.setAeroportArrivee(res.getString(3));
			t.setDureeVol(res.getInt(4));
		}

		return t;
	}
	
	public static int add(Vol vol) {
		return 0;
	}

	public static int update(Vol vol) {
		return 0;
	}

	public static int remove(int idvol) throws Exception {
		String sql = "delete from Vol where idvol="+idvol;
		return DBUtils.executeRequeteLMD(sql);
	}
}
