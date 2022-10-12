<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>

<form action="Controller" method="get">

		<table border="1">

			<tr>
				<th>id</th>
				<th>name</th>
				<th>Action</th>
			</tr>


			<c:forEach var="a" items="${mylistcar}">
				<tr>
					<td>${a.id}</td>
					<td>${a.nameCar}</td>
					<td><input type="submit" value="edit" name="action" /></td>
					<td><input type="submit" value="delete" name="action" /></td>
					<td><a href=""></a></td>
				</tr>
			</c:forEach>


		</table>
	<a href="add.jsp">Back To add</a>
	
	</form>
</body>
</html>