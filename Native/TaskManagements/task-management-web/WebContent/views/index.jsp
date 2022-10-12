<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<h1>Welcome to our native Java EE Application</h1>

	<form action="client" method="get">
		<table>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Phone :</td>
				<td><input type="number" name="phone"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="create" id="myid"></td>
			</tr>
		</table>
	</form>

</body>
</html>