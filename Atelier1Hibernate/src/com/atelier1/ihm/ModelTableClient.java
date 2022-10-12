package com.atelier1.ihm;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.atelier1.dao.DAOclient;
import com.atelier1.models.Client;

public class ModelTableClient extends AbstractTableModel{

	String[] columns = {"id","Nom","Prenom","Date Naissance"};
	List<Client> cls;
	
	public ModelTableClient() {
		super();
		this.cls = DAOclient.getAll();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columns.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return cls.size();
	}

	@Override
	public String getColumnName(int col) {
		// TODO Auto-generated method stub
		return columns[col];
	}
	
	@Override
	public Object getValueAt(int row, int col) {

		switch (col) {
		case 0:return cls.get(row).getId();
		case 1:return cls.get(row).getNom();
		case 2:return cls.get(row).getPrenom();
		case 3:return cls.get(row).getDateNaissance();
		
		
		}
		
		return null;
	}

}
