package dao;

import java.util.List;

import com.beans.eleves;


public class TestDao {

	public static void main(String[] args) {
		
		elevesDaoImpl dao =new elevesDaoImpl();
		eleves e1=dao.save(new eleves("ali","kkkk","hdhkdk","bac"));
		
		
		System.out.println(e1.toString());
		
		System.out.println("chercher des produits");
		List<eleves> prods=dao.elevesParMC("%H%");
		for(eleves e:prods) {
			System.out.println(e.toString());
		}
	}

	
}
