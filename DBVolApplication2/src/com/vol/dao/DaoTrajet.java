package com.vol.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.database.utils.DBUtils;
import com.vol.entities.Avion;
import com.vol.entities.Trajet;
import com.vol.entities.Vol;

public class DaoTrajet {

	public static ArrayList<Trajet> getAll() throws Exception {
		ArrayList<Trajet> trajets = new ArrayList<>();
		String sql = "SELECT * FROM TRAJET";

		ResultSet res = DBUtils.executeRequete(sql);

		while (res.next()) {
			Trajet p = new Trajet();

			p.setId(res.getInt(1));
			p.setAeroportDepart(res.getString(2));
			p.setAeroportArrivee(res.getString(3));
			p.setDureeVol(res.getInt(4));

			trajets.add(p);
		}

		return trajets;
	}

	public static ArrayList<Vol> getAllVols(int idtrajet) throws Exception {
		ArrayList<Vol> vols = new ArrayList<>();

		String sql = "SELECT * FROM VOL where idtrajet=" + idtrajet;

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

	public static Trajet getOne(int idtrajet) throws Exception {
		String sql = "SELECT * FROM TRAJET WHERE idTrajet =" + idtrajet;
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

	public int add(Trajet trajet) {
		return 0;
	}

	public int update(Trajet trajet) {
		return 0;
	}

	public int remove(int idtrajet) throws Exception {
		String sql = "delete from Trajet where idtrajet="+idtrajet;
		return DBUtils.executeRequeteLMD(sql);
	}
}
