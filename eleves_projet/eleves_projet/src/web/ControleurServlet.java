package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.eleves;
import com.beans.utilisateur;

import dao.IPElevesDao;
import dao.elevesDaoImpl;

/**
 * Servlet implementation class ControleurServlet
 */
@WebServlet(name="cs",urlPatterns= {"*.do"})
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IPElevesDao metier;
	
	
	@Override
	public void init() throws ServletException {
		metier= new elevesDaoImpl();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		if(path.equals("/index.do")) {
			request.getRequestDispatcher("eleves.jsp").forward(request, response);
		}
	
	else if(path.equals("/login.do")) {

		try{
			String dblogin=request.getParameter("login");
			String dbpassword=request.getParameter("password");
			String  message;
			if(dblogin.trim().isEmpty() || dbpassword.trim().isEmpty()) {
				message="Vous devez remplire tous les champs svp !!";
				request.setAttribute("message", message);
				this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			}
			else {
				message="Inscription avec Succés ";
				request.setAttribute("message", message);
			utilisateur u=new utilisateur();
			u.setLogin(dblogin);
			u.setPassword(dbpassword);
			
			String test=metier.loginutilisateur(u);
			
			if(test.equals("success")) {
				request.getRequestDispatcher("eleves.jsp").forward(request, response);
			}else {
				response.sendRedirect("index.jsp");
			}
			}
			}catch (Exception e) {
				System.out.println("erooooooore"+e.getMessage());
			}
	}
		else if(path.equals("/chercher.do")) {
			String motCle=request.getParameter("motCle");
			ElevesModel model=new ElevesModel();
			model.setMotCle(motCle);
			List<eleves> eleve=metier.elevesParMC("%"+motCle+"%");
			model.setEleve(eleve);
			request.setAttribute("model", model);
			request.getRequestDispatcher("eleves.jsp").forward(request, response);
		}
		else if(path.equals("/saisie.do")) {
			request.setAttribute("eleve", new eleves());
			request.getRequestDispatcher("Saisie.jsp").forward(request, response);
		}
		else if(path.equals("/SaveEleve.do")&&(request.getMethod().equals("POST"))) {
			String nom=request.getParameter("nom");
			String prenom=request.getParameter("prenom");
			String adresse=request.getParameter("adresse");
			String niveau=request.getParameter("niveau");
			
					eleves e=metier.save(new eleves(nom, prenom, adresse, niveau));
					request.setAttribute("eleve", e);
					request.getRequestDispatcher("Confirmation.jsp").forward(request, response);
		}
		else if(path.equals("/supprime.do")) {
			int id=Integer.parseInt(request.getParameter("id"));
			metier.deleteeleves(id);
		//	request.getRequestDispatcher("produits.jsp").forward(request, response);
			response.sendRedirect("chercher.do?motCle=");
		}
		else if(path.equals("/edit.do")) {
			int id=Integer.parseInt(request.getParameter("id"));
			eleves e=metier.getEleve(id);
			request.setAttribute("eleve", e);
			request.getRequestDispatcher("EditEleve.jsp").forward(request, response);
		}
		else if(path.equals("/UpdateEleve.do")&&(request.getMethod().equals("POST"))) {
			int id=Integer.parseInt(request.getParameter("id"));
			String nom=request.getParameter("nom");
			String prenom=request.getParameter("prenom");
			String adresse=request.getParameter("adresse");
			String niveau=request.getParameter("niveau");
			
			eleves e=new eleves(nom, prenom, adresse, niveau);
			e.setId(id); 
			metier.update(e);
			request.setAttribute("eleve", e);
					request.getRequestDispatcher("Confirmation.jsp").forward(request, response);
		}
		else {
			response.sendError(org.apache.catalina.connector.Response.SC_NOT_FOUND);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
