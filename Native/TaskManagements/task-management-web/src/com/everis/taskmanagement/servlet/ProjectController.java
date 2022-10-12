package com.everis.taskmanagement.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.everis.taskmanagement.dto.ClientDTO;
import com.everis.taskmanagement.dto.ProjectDTO;
import com.everis.taskmanagement.service.ProjectService;

public class ProjectController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private ProjectService projectService;

	public ProjectController() {

		// XML Configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration.xml");
		projectService = context.getBean(ProjectService.class);
		((ClassPathXmlApplicationContext) context).close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		try {
			switch (action) {
			case "add":
				addProjecs(request, response);
				break;
			case "Toedit":
				showEditForm(request, response);
				break;
			case "delete":
				deleteProject(request, response);
				break;
			case "upTodate":
				UpdateProject(request, response);
				break;

			}
		} catch (Exception ex) {
			throw new ServletException(ex);
		}

//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
//		
//		
//		String name = request.getParameter("nameproject");
//		String startDate = request.getParameter("startdate");
//		String endDate = request.getParameter("endDate");
//		String description = request.getParameter("description");
//		
//		
//		
//		ProjectDTO project;
//		try {
//			 project = new ProjectDTO(name,dateFormat.parse(startDate),dateFormat.parse(endDate),description);
//
//			projectService.create(project);
//			System.out.println("add done");
//		} catch (Exception e) {
//			System.out.println("add not succes");
//		}
//
//		List<ProjectDTO> projectsList = projectService.getAll();
//
//		request.setAttribute("projectList", projectsList);
//		RequestDispatcher listView = request.getRequestDispatcher("views/project.jsp");
//
//		listView.forward(request, response);
	}

//	   @SuppressWarnings("unused")
//	private void listProjects(HttpServletRequest request, HttpServletResponse response)
//	            throws IOException, ServletException {
//	        List<ProjectDTO> projectsList =  projectService.getAll();
//	        request.setAttribute("projectList", projectsList);
//	        RequestDispatcher dispatcher = request.getRequestDispatcher("views/project.jsp");
//	        dispatcher.forward(request, response);
//	    }

	@SuppressWarnings("unused")
	private void addProjecs(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

		String name = request.getParameter("nameproject");
		String startDate = request.getParameter("startdate");
		String endDate = request.getParameter("endDate");
		String description = request.getParameter("description");

		ProjectDTO project;
		try {
			project = new ProjectDTO(name, dateFormat.parse(startDate), dateFormat.parse(endDate), description);

			projectService.create(project);
			System.out.println("add done");
		} catch (Exception e) {
			System.out.println("add not succes");
		}

		List<ProjectDTO> projectsList = projectService.getAll();

		request.setAttribute("projectList", projectsList);
		RequestDispatcher listView = request.getRequestDispatcher("views/project.jsp");

		listView.forward(request, response);

	}

	@SuppressWarnings("unused")
	private void deleteProject(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String projectid = request.getParameter("id");

		long idToDelete = Long.parseLong(projectid);

		try {
			// ClientDTO client = clientService.getByPK(idToDelete);
			projectService.delete(idToDelete);
			System.out.println("delete done");

		} catch (Exception e) {
			// Logger l'erreur
			System.out.println("delete not done");
		}

		List<ProjectDTO> projectsList = projectService.getAll();

		request.setAttribute("projectList", projectsList);
		RequestDispatcher listView = request.getRequestDispatcher("views/project.jsp");

		listView.forward(request, response);
	}

	private void UpdateProject(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

		String name = request.getParameter("upnameproject");
		String startDate = request.getParameter("upstartdate");
		String endDate = request.getParameter("upendDate");
		String description = request.getParameter("updescription");
		String id = request.getParameter("upid");

		// System.out.println(clientId+" "+name+" "+email+" "+phone);

		long idToUpdate = Long.parseLong(id);

		ProjectDTO project;

		try {

			project = new ProjectDTO(idToUpdate, name, dateFormat.parse(startDate), dateFormat.parse(endDate),
					description);
			projectService.update(idToUpdate, project);
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<ProjectDTO> projectsList = projectService.getAll();

		request.setAttribute("projectList", projectsList);
		RequestDispatcher listView = request.getRequestDispatcher("views/project.jsp");

		listView.forward(request, response);

	}

	@SuppressWarnings("unused")
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ProjectDTO projectDTO = new ProjectDTO();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

		String name = request.getParameter("nameproject");
		String startDate = request.getParameter("startdate");
		String endDate = request.getParameter("endDate");
		String description = request.getParameter("description");
		String id = request.getParameter("id");

		// System.out.println(clientId+" "+name+" "+email+" "+phone);

		long idToUpdate = Long.parseLong(id);

		ProjectDTO existingProject = projectService.getvalueById(idToUpdate);

		projectDTO.getId();
		projectDTO.getName();
		projectDTO.getStartDate();
		projectDTO.getEndDate();
		projectDTO.getDescription();

		RequestDispatcher dispatcher = request.getRequestDispatcher("views/project.jsp");
		// request.setAttribute("project", existingProject);
		dispatcher.forward(request, response);

	}

}
