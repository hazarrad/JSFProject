package com.everis.taskmanagement.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.everis.taskmanagement.dto.ClientDTO;
import com.everis.taskmanagement.service.ClientService;

@SuppressWarnings("serial")
public class ClientDeleteServlet extends HttpServlet{
	
	private ClientService clientService;

	public ClientDeleteServlet() {

		// XML Configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration.xml");
		clientService = context.getBean(ClientService.class);
		((ClassPathXmlApplicationContext) context).close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String clientId = request.getParameter("clientId");

		long idToDelete = Long.parseLong(clientId);
		

		try {
			//ClientDTO client = clientService.getByPK(idToDelete);
			clientService.delete(idToDelete);

		} catch (Exception e) {
			// Logger l'erreur
			e.printStackTrace();
		}
		
		List<ClientDTO> clientList = clientService.getAll();

		request.setAttribute("clientList", clientList);

		RequestDispatcher listView = request.getRequestDispatcher("views/client.jsp");

		listView.forward(request, response);
	}
	
	
	

}
