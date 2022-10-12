/*
 * package com.everis.taskmanagement.servlet;
 * 
 * import java.io.IOException; import java.time.LocalDate; import
 * java.util.Date; import java.util.List;
 * 
 * import javax.servlet.RequestDispatcher; import
 * javax.servlet.ServletException; import javax.servlet.http.HttpServlet; import
 * javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import org.springframework.context.ApplicationContext; import
 * org.springframework.context.support.ClassPathXmlApplicationContext;
 * 
 * import com.everis.taskmanagement.dto.EmployeeDTO; import
 * com.everis.taskmanagement.enums.Grade; import
 * com.everis.taskmanagement.enums.Profile; import
 * com.everis.taskmanagement.service.EmployeeService;
 * 
 * @SuppressWarnings("serial") public class EmployeeServlet extends HttpServlet{
 * 
 * private EmployeeService employeeService;
 * 
 * public EmployeeServlet() {
 * 
 * // XML Configuration ApplicationContext context = new
 * ClassPathXmlApplicationContext("spring-configuration.xml"); employeeService =
 * context.getBean(EmployeeService.class); ((ClassPathXmlApplicationContext)
 * context).close(); }
 * 
 * @Override protected void doGet(HttpServletRequest request,
 * HttpServletResponse response) throws ServletException, IOException { String
 * number = request.getParameter("number"); String firstName =
 * request.getParameter("firstName"); String lastName =
 * request.getParameter("lastName"); String grade =
 * request.getParameter("grade"); String email = request.getParameter("email");
 * String password = request.getParameter("password"); String profile =
 * request.getParameter("profile"); String intergrationDate =
 * request.getParameter("intergrationDate");
 * 
 * EmployeeDTO employee = new EmployeeDTO(Integer.valueOf(number), firstName,
 * lastName, Grade.valueOf(grade), email, password, Profile.valueOf(profile),
 * LocalDate.parse(intergrationDate));
 * 
 * try { employeeService.create(employee); } catch (Exception e) {
 * e.printStackTrace(); }
 * 
 * List<EmployeeDTO> employeeList = employeeService.getAll();
 * 
 * request.setAttribute("employeeList", employeeList); RequestDispatcher
 * listView = request.getRequestDispatcher("views/employee.jsp");
 * 
 * listView.forward(request, response); }
 * 
 * @Override protected void doPost(HttpServletRequest req, HttpServletResponse
 * resp) throws ServletException, IOException { doGet(req, resp); }
 * 
 * 
 * 
 * }
 */