package com.Dao.vols;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.database.utils.DBUtils;
import com.enteite.Avion;
import com.enteite.pilote;

public class DaoAvion {

	
	public static ArrayList<Avion> getAllAvion() throws Exception {

		ArrayList<Avion> av = new ArrayList<>();
		String sql = "SELECT * FROM Avion";
		Avion v = null;

		ResultSet r = DBUtils.executeRequete(sql);

		while (r.next()) {
			v = new Avion();
			v.setIdAvion(r.getInt(1));
			v.setCompagnie(r.getString(2));
			v.setType(r.getString(3));
			v.setDateMiseMarche(r.getDate(7));

			av.add(v);

		}

		return av;
	}

	public static ArrayList<Integer> getAllCodesAvion() throws Exception {

		ArrayList<Integer> ids = new ArrayList<>();
		String sql = "SELECT idavion FROM Avion";

		ResultSet r = DBUtils.executeRequete(sql);

		while (r.next()) {
			ids.add(r.getInt(1));
		}
		return ids;
	}

	public static Avion getOneavion(int code) throws Exception {

		String sql = "SELECT * FROM Avion WHERE idAvion  = " + code;

		ResultSet r = DBUtils.executeRequete(sql);

		Avion v = null;
		if (r.next()) {
			v = new Avion();
			v.setIdAvion(r.getInt(1));
			v.setCompagnie(r.getString(2));
			v.setType(r.getString(3));
			v.setDateMiseMarche(r.getDate(7));
		}

		return v;
	}

	public static int addAvion(Avion v) throws Exception {
		
		SimpleDateFormat format= new SimpleDateFormat("yyyy/mm/dd");

		String req = "insert into Avion VALUES (null,'"
		
		+ v.getCompagnie() + "','" 
		+ v.getType() + "','"
		
		+format.format(v.getDateMiseMarche())+"',"
		
		+ ")";

		return DBUtils.executeRequeteLMD(req);
	}

	public static int Updatepilote(pilote p) throws Exception {
		SimpleDateFormat format= new SimpleDateFormat("yyyy-mm-dd");

		String sql = "UPDATE pilote"
				+ " SET  nom = '" + p.getNom()+"' , "
				+"Set Prenom='" +p.getPrenom()+"',"
				+"Set adresse='" +p.getAdresse()+"',"
				+"Set tel='" +p.getTel()+"',"
				+"DateNaissance='"+format.format(p.getDateNaissance())+"',"
				+"DateEmbauche='"+format.format(p.getDateEmbauche())+"',"
				+ " WHERE IdPilote = " + p.getIdPilote();
		
		System.out.println(sql);
		return DBUtils.executeRequeteLMD(sql);
	}

	public static int DeleteProduit(int id) throws Exception {

		String sql = "DELETE FROM pilote WHERE IdPilote = " + id;

		return DBUtils.executeRequeteLMD(sql);
	}

}
