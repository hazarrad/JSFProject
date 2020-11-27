package com.traitement;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Beans.Client;
import com.dao.DaoClient;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/servlet")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a= Integer.parseInt((String) request.getParameter("id"));
		switch(a) {
		case 1: 
			
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			break;
        case 2: 
			try {
				request.setAttribute("cls", DaoClient.getAllClient());
				getServletContext().getRequestDispatcher("/displayClient.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		case 3: 
			
			getServletContext().getRequestDispatcher("/addClient.jsp").forward(request, response);
			break;
	
		case 4:
			Client c = new Client(Integer.valueOf(request.getParameter("code")),request.getParameter("nom"),request.getParameter("prenom"),request.getParameter("adresse"));
			try {
				DaoClient.addClient(c);
				getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
