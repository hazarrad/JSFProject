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
<div>Editer d'un eleve</div>
	<form action="UpdateEleve.do" method="post">
	<div>
			<label>ID</label>
			<input type="text" name="id" value="${eleve.id }">
			<span></span>
		</div>
		
		<div>
			<label>NOM</label>
			<input type="text" name="nom" value="${eleve.nom }">
			<span></span>
		</div>
		
		<div>
			<label>PRENOM</label>
			<input type="text" name="prenom" value="${eleve.prenom }">
			<span></span>
		</div>
		
		<div>
			<label>ADRESSE</label>
			<input type="text" name="adresse" value="${eleve.adresse }">
			<span></span>
		</div>
		
			<div>
			<label>NIVEAU</label>
			<input type="text" name="niveau" value="${eleve.niveau }">
			<span></span>
		</div>
		<div><button type="submit">Save</button></div>
	</form>
	</center>
</body>
</html>