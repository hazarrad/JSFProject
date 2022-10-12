package com.Dao.vols;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.database.utils.DBUtils;
import com.enteite.pilote;

public class DoaPilote {
	public static ArrayList<pilote> getAllpilote() throws Exception {

		ArrayList<pilote> plt = new ArrayList<>();
		String sql = "SELECT * FROM pilote";
		pilote p = null;

		ResultSet r = DBUtils.executeRequete(sql);

		while (r.next()) {
			p = new pilote();
			p.setIdPilote(r.getInt(1));
			p.setNom(r.getString(2));
			p.setPrenom(r.getString(3));
			p.setAdresse(r.getString(4));
			p.setTel(r.getString(5));
			p.setDateNaissance(r.getDate(6));
			p.setDateEmbauche(r.getDate(7));

			plt.add(p);

		}

		return plt;
	}

	public static ArrayList<Integer> getAllCodespilote() throws Exception {

		ArrayList<Integer> ids = new ArrayList<>();
		String sql = "SELECT IdPilote FROM pilote";

		ResultSet r = DBUtils.executeRequete(sql);

		while (r.next()) {
			ids.add(r.getInt(1));
		}
		return ids;
	}

	public static pilote getOnepilote(int code) throws Exception {

		String sql = "SELECT * FROM pilote WHERE IdPilote = " + code;

		ResultSet r = DBUtils.executeRequete(sql);

		pilote p = null;
		if (r.next()) {
			p = new pilote();
			p.setIdPilote(r.getInt(1));
			p.setNom(r.getString(2));
			p.setPrenom(r.getString(3));
			p.setAdresse(r.getString(4));
			p.setTel(r.getString(5));
			p.setDateNaissance(r.getDate(6));
			p.setDateEmbauche(r.getDate(7));
		}

		return p;
	}

	public static int addpilote(pilote p) throws Exception {
		
		SimpleDateFormat format= new SimpleDateFormat("yyyy/mm/dd");

		String req = "insert into pilote VALUES (null,'"
		+ p.getNom() + "','" 
		+ p.getPrenom() + "','"
		+ p.getAdresse() + "','" 
		+ p.getTel() + "'," 
		+format.format(p.getDateNaissance())+"',"
		+format.format(p.getDateEmbauche())+"',"
		
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
