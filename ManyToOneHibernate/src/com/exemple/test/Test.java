package com.exemple.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ecole.beans.Etudiant;
import com.ecole.beans.Filiere;
import com.exemple.utils.HibernateUtile;

public class Test {

	public static void main(String[] args) {
		
		Session s = HibernateUtile.getSessionFactory().getCurrentSession();
		Transaction tr =s.beginTransaction();
		

		Filiere f= new Filiere();
		f.setLibelle("New FIL");
		f.setNiveau("T");
		
		Etudiant e1 = new Etudiant();
		e1.setNom("JOJO");
		e1.setPrenom("JOJO");
		e1.setFiliere(f);
		
		s.save(e1);	
		s.save(f);

//		tr.commit();
		
		System.out.println("Successfully inserted");
//		s.close();
		
//		List<Etudiant> ets = s.createQuery("from Etudiant").list();
//		for(Etudiant e : ets) {
//			System.out.println(e + " "+e.getFiliere().getId_fil() );
//		}

//		List<Filiere> fls =s.createQuery("from Filiere").list();
//		for(Etudiant et : fls.get(0).getEtudiants()) {
//			System.out.println(et);
//		}

		List<Filiere> fls =s.createQuery("from Filiere").list();
		for (Filiere filiere : fls) {
			System.out.println(filiere);
		}
	}

}
