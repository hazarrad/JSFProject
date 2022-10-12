package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.eleves;
import com.beans.utilisateur;



public class elevesDaoImpl implements IPElevesDao{

	@Override
	public eleves save(eleves e) {
		Connection connection =SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("INSERT INTO ELEVES (NOM,PRENOM,ADRESSE,NIVEAU) values (?,?,?,?)");
			ps.setString(1, e.getNom());
			ps.setString(2, e.getPrenom());
			ps.setString(3, e.getAdresse());
			ps.setString(4, e.getNiveau());
			
			ps.executeUpdate();
			PreparedStatement e2=connection.prepareStatement
					("SELECT MAX(ID) AS MAX_ID FROM ELEVES");
			ResultSet rs=e2.executeQuery();
			if(rs.next()) {
				e.setId(rs.getInt("MAX_ID"));
			}
			ps.close();
			
		} catch (SQLException ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
		}
		return e;
	}

	@Override
	public List<eleves> elevesParMC(String mc) {
	
		List<eleves> eleve=new ArrayList<eleves>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("SELECT * FROM ELEVES WHERE NOM LIKE ?");
			ps.setString(1, mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				eleves e=new eleves();
				e.setId(rs.getInt("ID"));
				e.setNom(rs.getString("NOM"));
				e.setPrenom(rs.getString("PRENOM"));
				e.setAdresse(rs.getString("ADRESSE"));
				e.setNiveau(rs.getString("NIVEAU"));
				
				eleve.add(e);
			}
		} catch (SQLException ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
		}
		return eleve;
		
	}

	@Override
	public eleves getEleve(int id) {
		eleves e=null;
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("SELECT * FROM ELEVES WHERE ID=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				e=new eleves();
				e.setId(rs.getInt("id"));
				e.setNom(rs.getString("NOM"));
				e.setPrenom(rs.getString("PRENOM"));
				e.setAdresse(rs.getString("ADRESSE"));
				e.setNiveau(rs.getString("NIVEAU"));
			}
		} catch (SQLException ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
		}
		return e;
	}

	@Override
	public eleves update(eleves e) {
		Connection connection =SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("UPDATE ELEVES SET NOM=?,PRENOM=?,ADRESSE=?,NIVEAU=? WHERE ID=?");
			ps.setString(1, e.getNom());
			ps.setString(2, e.getPrenom());
			ps.setString(3, e.getAdresse());
			ps.setString(4, e.getNiveau());
			ps.setInt(5, e.getId());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
		}
		return e;
	}

	@Override
	public void deleteeleves(int id) {
		Connection connection =SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("DELETE FROM ELEVES WHERE ID=?");
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
		}
		
	}

	@Override
	public String loginutilisateur(utilisateur u) {
		Connection connection =SingletonConnection.getConnection();
		String login=u.getLogin();
		String password=u.getPassword();
		try {
			PreparedStatement ps=connection.prepareStatement
			("select * from utilisateur where login=? and password=?");
			
			ps.setString(1, u.getLogin());
			ps.setString(2, u.getPassword());
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String dblogin=rs.getString("login");
				String dbpassword=rs.getString("password");
				if(dblogin.equals(login) && dbpassword.equalsIgnoreCase(password)) {
					return "success";
				}
				return "errore";
			}
			
		} catch (Exception e) {
			System.out.println("From Login");
		}
		return "errore";
	}
	

		
		
	

}
