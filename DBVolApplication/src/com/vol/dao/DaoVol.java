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
	
	public static Pilote getPilote(int idVol) {
		String sql = "select p.* " + 
				" from vol v " + 
				"     inner join pilote p on v.idpilote = p.idpilote " + 
				" where v.idvol =" +idVol;
		return null;
	}

	public static Avion getAvion(int idVol) {
		
		String sql = "select a.* " + 
				"from vol v " + 
				"     inner join avion a on v.idavion = a.idavion " + 
				"where v.idvol ="+idVol;
		return null;
	}
	
	public static Trajet getTrajet(int idVol) {
		
		String sql="select t.* " + 
				"from vol v " + 
				"     inner join trajet t on v.idtrajet = t.idtrajet " + 
				"where v.idvol ="+idVol;
		return null;
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
