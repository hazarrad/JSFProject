<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add Client</title>
</head>
<body>
<form action="/Atelier6Mvc/servlet"">
<input type="hidden" name="id" value="4">
code Client : <input type="text" name ="code"><br>
nom Client : <input type="text" name ="nom"><br>
prenom Client : <input type="text" name ="prenom"><br>
Adresse : <input type="text" name ="adresse"><br>
<input type="submit" value="enregistrer">

</form>

<a href="/Atelier6Mvc/servlet?id=1"><input type="submit" value="annuler"></a>
</body>
</html>