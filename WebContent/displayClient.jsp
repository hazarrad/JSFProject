<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Beans.Client"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>code client</th>
<th>nom client</th>
<th>prénom client</th>
<th>adresse</th>
</tr>
<% ArrayList<Client> clients=(ArrayList<Client>)request.getAttribute("cls");
	for(Client c : clients){
	%>
	<tr>
	<td><%=c.getCodeClient() %></td>
	<td><%=c.getNomClient() %></td>
	<td><%=c.getPrenomClient() %></td>
	<td><%=c.getAdresse() %></td>
	</tr>
	<%} %>
</table>
</body>
</html>