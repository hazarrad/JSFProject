<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>


	<form action="project" method="get">
		<table>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="nameproject"></td>
			</tr>
			<tr>
				<td>start date :</td>
				<td><input type="date" name="startdate"></td>
			</tr>
			<tr>
				<td>end date :</td>
				<td><input type="date" name="endDate"></td>
			</tr>
			<tr>
				<td>description :</td>
				<td><input type="text" name="description"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="create" id="myid"></td>
			</tr>
		</table>
	</form>


</body>
</html>