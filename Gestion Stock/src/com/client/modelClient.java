package com.client;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;


public class modelClient extends AbstractTableModel {

	
	
	ArrayList<String> cols=new ArrayList<>();
	ArrayList<Client> rows=new ArrayList<>();
	
	public modelClient(){
		
	}

	public modelClient(ArrayList<String> cols, ArrayList<Client> rows) {
		super();
		this.cols = cols;
		this.rows = rows;
	}

	@Override
	public int getColumnCount() {
		return cols.size();

	}

	@Override
	public int getRowCount() {
		return rows.size();

	}
	
	@Override
	public String getColumnName(int c) {
		return cols.get(c);
	}

	@Override
	public Object getValueAt(int r, int c) {


		switch (c) {
		case 0:return rows.get(r).getIdClient();
		case 1:return rows.get(r).getNom();
		case 2:return rows.get(r).getPrenom();
		case 3:return rows.get(r).getDatenaissance();
		case 4:return rows.get(r).getAdresse();
		case 5:return rows.get(r).getCodepostal();
		case 6:return rows.get(r).getVille();
		case 7:return rows.get(r).getPays();
		case 8:return rows.get(r).getTelephone();
		case 9:return rows.get(r).getEmail();
			
			
		}
		return null;
	}
	
	
	
}
