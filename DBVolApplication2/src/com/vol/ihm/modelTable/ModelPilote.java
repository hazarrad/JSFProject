package com.vol.ihm.modelTable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import com.vol.entities.Pilote;


public class ModelPilote extends AbstractTableModel{

	String[] cols = {"Id","Nom","Prenom","Adresse","Telephone","Date Naissance","Date Embauche"};
	ArrayList<Pilote> pilotes; 
	
	
	public ModelPilote(ArrayList<Pilote> pilotes) {
		super();
		this.pilotes = pilotes;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return cols.length;
	}

	@Override
	public String getColumnName(int arg0) {
		// TODO Auto-generated method stub
		return cols[arg0];
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return pilotes.size();
	}

	@Override
	public Object getValueAt(int r, int c) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		switch(c) {
			case 0 : return pilotes.get(r).getId();
			case 1 : return pilotes.get(r).getNom();
			case 2 : return pilotes.get(r).getPrenom();
			case 3 : return pilotes.get(r).getAdresse();
			case 4 : return pilotes.get(r).getTel();
			case 5 : return format.format(pilotes.get(r).getDateNaissance());
			case 6 : return format.format(pilotes.get(r).getDateEmbauche());
		}
		
		return null;
	}

}
