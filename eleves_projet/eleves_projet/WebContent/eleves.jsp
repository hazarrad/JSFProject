<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<center>
<div>Recherche des eleves</div>
	<form action="chercher.do" method="get">
		<label>Mot Clé</label>
		<input type="text" name="motCle" value="${model.motCle}"/>
		<button type="submit">Chercher</button>
	</form>
	</center>
	<table align="center">
		<tr>
			<th>ID</th><th>NOM</th><th>PRENOM</th><th>ADRESSE</th><th>NIVEAU</th>
		</tr>
		<c:forEach items="${model.eleve}" var="e">
			<tr>
				<td>${e.id}</td>
				<td>${e.nom}</td>
				<td>${e.prenom}</td>
				<td>${e.adresse}</td>
				<td>${e.niveau}</td>
				<td><a onclick="return confirm('Etes vous sur ?')" href="supprime.do?id=${e.id }">Supprimer</a></td>
				<td><a href="edit.do?id=${e.id }">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>