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

public class ClientServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ClientService clientService;

	public ClientServlet() {

		// XML Configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration.xml");
		clientService = context.getBean(ClientService.class);
		((ClassPathXmlApplicationContext) context).close();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		ClientDTO client = new ClientDTO(name, email, Integer.valueOf(phone));

		try {
			clientService.create(client);
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<ClientDTO> clientList = clientService.getAll();

		request.setAttribute("clientList", clientList);
		RequestDispatcher listView = request.getRequestDispatcher("views/client.jsp");

		listView.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	

}
