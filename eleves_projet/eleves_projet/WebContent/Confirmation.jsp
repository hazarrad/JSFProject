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
<div>Confirmation</div>
	<div>
		<label>ID :</label>
		<label>${eleve.id}</label>
	</div>
	<div>
		<label>NOM :</label>
		<label>${eleve.nom}</label>
	</div>
	<div>
		<label>PRENOM :</label>
		<label>${eleve.prenom}</label>
	</div>
	<div>
		<label>Adresse :</label>
		<label>${eleve.adresse}</label>
	</div>
	<div>
		<label>NIVEAU :</label>
		<label>${eleve.niveau}</label>
	</div>
	</center>
</body>
</html>