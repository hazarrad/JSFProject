<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>

	<div id="divTableau">
	<table id="clientTable" border="1">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Editer</th>
			<th>Supprimer</th>
		</tr>
		<c:forEach var="client" items="${clientList}">
			<tr>
				<td class="${client.id}">${client.name}</td>
				<td class="${client.id}">${client.email}</td>
				<td class="${client.id}">${client.phone}</td>
				<td><input type="submit" value="editer" onclick="showEditEmployeeForm('${client.id}')"></td>
				<td>
					<form action="deleteClient" method="post">
						<input type="hidden" name="clientId" value="${client.id}">
						<input type="submit" value="delete">
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="/task-management-web">retour vers client</a>
	</div>
	
	<div id="divFormUpdate" style="display:none">
	<form action="updateClient" method="post">
		<table>
			<tr>
				<td>Name :</td>
				<td><input id="name" type="text" name="name" value=""></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input id="email" type="text" name="email"  value=""></td>
			</tr>
			<tr>
				<td>Phone :</td>
				<td><input id="phone" type="number" name="phone"  value=""></td>
			</tr>
			<tr>
				<td><input id="clientId" name="clientId" type="text" value="" hidden></td>
				<td><input type="submit" value="update"></td>
			</tr>
		</table>
	</form>
	</div>
	
</body>


    <script>
    
	/*------------------------------ Ajouter Employee ------------------------------*/
	
	/*function showUpdateClientFormaaaaaaaaaaaaaaaaa()
	{
		//alert('some anchor clicked');
		//$("#editEmployeeButton").hide();
		//$("#addEmployeeButton").show();
		$('#divTableau').hide();
		$("#divFormUpdate").show();
	}
	
	function showEmployeeList()
	{
		
	}*/
	
	function showEditEmployeeForm(id)
	{
		$("#divTableau").hide();
		$("#divFormUpdate").show();
		
		
		
		var idsInputs = ["#name", "#email", "#phone"];
		var i=0;
		//console.log("================ id = "+id);
		
		//$("#tableClient").children("tbody ."+id)
		$('#clientTable tr .'+id).each(function()
		{
			var value = $(this).html();
			
			
			
			$(idsInputs[i]).val(value);
			$(idsInputs[i]).parent("div").children("label").addClass("active");
			
			console.log("--- value : "+value);
			i++;
		});
		
		$("#clientId").val(id);
		//$('#divFormUpdate').append('<input id="clientId" name="clientId" type="text" value="'+id+'"  />');
	}
	
	
	
    </script>

</html>