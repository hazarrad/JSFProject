package com.vol.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.vol.dao.DaoPilote;
import com.vol.entities.Pilote;
import com.vol.entities.Vol;

public class MainClass {
	
	public static void main(String[] args) throws Exception {
		
		ArrayList<Vol> vv = DaoPilote.getAllVols(2);
		
		for(Vol pp : vv)
			System.out.println(pp);
	}
}
