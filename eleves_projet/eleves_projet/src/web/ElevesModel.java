package web;

import java.util.ArrayList;
import java.util.List;

import com.beans.eleves;



public class ElevesModel {

	private String MotCle;
	private List<eleves> eleve=new ArrayList<eleves>();
	
	
	
	public String getMotCle() {
		return MotCle;
	}
	public void setMotCle(String motCle) {
		MotCle = motCle;
	}
	public List<eleves> getEleve() {
		return eleve;
	}
	public void setEleve(List<eleves> eleve) {
		this.eleve = eleve;
	}

	
}
