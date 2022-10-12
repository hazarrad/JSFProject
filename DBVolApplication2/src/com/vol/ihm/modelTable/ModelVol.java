package com.vol.ihm.modelTable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import com.vol.dao.DaoVol;
import com.vol.entities.Avion;
import com.vol.entities.Trajet;
import com.vol.entities.Vol;

public class ModelVol extends AbstractTableModel{

	String[] cols = {"Id vol","Date du vol","Heure Decalage","Aeroport Depart","Aeroport Arrivee","Duree Trajet","Compagnie Avion","Type Avion"};
	ArrayList<Vol> vols;
	
	
	
	public ModelVol(ArrayList<Vol> vols) {
		super();
		this.vols = vols;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return cols.length;
	}

	@Override
	public String getColumnName(int c) {
		// TODO Auto-generated method stub
		return cols[c];
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return vols.size();
	}

	@Override
	public Object getValueAt(int r, int c) {
		try {
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			Trajet t = DaoVol.getTrajet(vols.get(r).getId());
			Avion a = DaoVol.getAvion(vols.get(r).getId());
			
			switch(c) {
			case 0: return vols.get(r).getId();
			case 1: return format.format(vols.get(r).getDateVol());
			case 2: return String.format("%dH : %dMin", vols.get(r).getHeureDecalage(),vols.get(r).getMinuteDecalage());
			case 3: return t.getAeroportDepart();
			case 4: return t.getAeroportArrivee();
			case 5: return t.getDureeVol();
			case 6: return a.getCompagnie();
			case 7: return a.getType();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

}
