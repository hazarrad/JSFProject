package com.springIOC.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springIOC.Entity.Car;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Car> listcar = new ArrayList<Car>();
	RequestDispatcher rd;

	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int id = Integer.valueOf(request.getParameter("id"));
		String name = request.getParameter("name");
		String action = request.getParameter("action");
		Car c = new Car();
		c.setId(id);
		c.setNameCar(name);

		switch (action) {
		case "add":
			listcar.add(c);

			request.setAttribute("mylistcar", listcar);

			rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);

			break;

		case "delete":

			try {

			

				rd = request.getRequestDispatcher("add.jsp");
				rd.forward(request, response);
				System.out.println("delete done");
			} catch (Exception e) {
				System.out.println("delete not complete");
			}

			break;

		case "edit":
			listcar.get(c.getId());

			request.setAttribute("mylistcar", listcar);

			rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);

			break;

		default:
			break;
		}

	}

}
