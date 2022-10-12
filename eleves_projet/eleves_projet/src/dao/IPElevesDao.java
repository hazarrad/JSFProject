package dao;

import java.util.List;

import com.beans.eleves;
import com.beans.utilisateur;



public interface IPElevesDao {

	public String loginutilisateur(utilisateur u);
	public eleves save(eleves e);
	public List<eleves> elevesParMC(String mc);
	public eleves getEleve(int id);
	public eleves update(eleves e);
	public void deleteeleves(int id);
}
