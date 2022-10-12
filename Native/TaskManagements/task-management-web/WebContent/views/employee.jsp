<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Task management</title>
<link rel="stylesheet" href="resources/css/employeeCSS.css" type="text/css"></link>
<script type="text/javascript" src="resources/js/employeeJS.js"></script>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.4.0/css/font-awesome.min.css">
<!--Google -Fonts-->
<link href='https://fonts.googleapis.com/css?family=Sintony:400,700&subset=latin-ext' rel='stylesheet' type='text/css'>


<style type="text/css">
	
	body {
		color: #566787;
		background: #f5f5f5;
		font-family: 'Varela Round', sans-serif;
		font-size: 13px;
		margin-top: 40px;
	}
	
	footer {
	    position: fixed;
	    height: 100px;
	    bottom: -30px;
	    width: 100%;
	}
	
	
	/*-------------------------< Table CSS >---------------------------*/
	
	.tableContainer {
		margin: 10px auto;
		margin-top: 50px;
		display: table;
		max-width: 1140px;
		width: 100%;
	}
	
	.table-wrapper {
		background: #fff;
		padding: 20px 25px;
		margin: 30px 0;
		border-radius: 3px;
		box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
	}
	
	.table-title {
		padding-bottom: 15px;
		background: #435d7d;
		color: #fff;
		padding: 16px 30px;
		margin: -20px -25px 10px;
		border-radius: 3px 3px 0 0;
	}
	
	.table-title h2 {
		margin: 5px 0 0;
		font-size: 24px;
	}
	
	.table-title .btn-group {
		float: right;
	}
	
	.table-title .btn {
		color: #fff;
		float: right;
		font-size: 13px;
		border: none;
		min-width: 50px;
		border-radius: 2px;
		border: none;
		outline: none !important;
		margin-left: 10px;
	}
	
	.table-title .btn i {
		float: left;
		font-size: 21px;
		margin-right: 5px;
	}
	
	.table-title .btn span {
		float: left;
		margin-top: 2px;
	}
	
	table.table tr th, table.table tr td {
		border-color: #e9e9e9;
		padding: 12px 15px;
		vertical-align: middle;
	}
	
	table.table tr th:first-child {
		width: 60px;
	}
	
	table.table tr th:last-child {
		width: 100px;
	}
	
	table.table-striped tbody tr:nth-of-type(odd) {
		background-color: #fcfcfc;
	}
	
	table.table-striped.table-hover tbody tr:hover {
		background: #f5f5f5;
	}
	
	table.table th i {
		font-size: 13px;
		margin: 0 5px;
		cursor: pointer;
	}
	
	table.table td:last-child i {
		opacity: 0.9;
		font-size: 22px;
		margin: 0 5px;
	}
	
	table.table td a {
		font-weight: bold;
		color: #566787;
		display: inline-block;
		text-decoration: none;
		outline: none !important;
	}
	
	table.table td a:hover {
		color: #2196F3;
	}
	
	table.table td a.edit {
		color: #FFC107;
	}
	
	table.table td a.delete {
		color: #F44336;
	}
	
	table.table td i {
		font-size: 19px;
	}
	
	table.table .avatar {
		border-radius: 50%;
		vertical-align: middle;
		margin-right: 10px;
	}
	
	.pagination {
		float: right;
		margin: 0 0 5px;
	}
	
	.pagination li a {
		border: none;
		font-size: 13px;
		min-width: 30px;
		min-height: 30px;
		color: #999;
		margin: 0 2px;
		line-height: 30px;
		border-radius: 2px !important;
		text-align: center;
		padding: 0 6px;
	}
	
	.pagination li a:hover {
		color: #666;
	}
	
	.pagination li.active a, .pagination li.active a.page-link {
		background: #03A9F4;
	}
	
	.pagination li.active a:hover {
		background: #0397d6;
	}
	
	.pagination li.disabled i {
		color: #ccc;
	}
	
	.pagination li i {
		font-size: 16px;
		padding-top: 6px
	}
	
	.hint-text {
		float: left;
		margin-top: 10px;
		font-size: 13px;
	}
	/* Custom checkbox */
	.custom-checkbox {
		position: relative;
	}
	
	.custom-checkbox input[type="checkbox"] {
		opacity: 0;
		position: absolute;
		margin: 5px 0 0 3px;
		z-index: 9;
	}
	
	.custom-checkbox label:before {
		width: 18px;
		height: 18px;
	}
	
	.custom-checkbox label:before {
		content: '';
		margin-right: 10px;
		display: inline-block;
		vertical-align: text-top;
		background: white;
		border: 1px solid #bbb;
		border-radius: 2px;
		box-sizing: border-box;
		z-index: 2;
	}
	
	.custom-checkbox input[type="checkbox"]:checked+label:after {
		content: '';
		position: absolute;
		left: 6px;
		top: 3px;
		width: 6px;
		height: 11px;
		border: solid #000;
		border-width: 0 3px 3px 0;
		transform: inherit;
		z-index: 3;
		transform: rotateZ(45deg);
	}
	
	.custom-checkbox input[type="checkbox"]:checked+label:before {
		border-color: #03A9F4;
		background: #03A9F4;
	}
	
	.custom-checkbox input[type="checkbox"]:checked+label:after {
		border-color: #fff;
	}
	
	.custom-checkbox input[type="checkbox"]:disabled+label:before {
		color: #b8b8b8;
		cursor: auto;
		box-shadow: none;
		background: #ddd;
	}
	/* Modal styles */
	.modal .modal-dialog {
		max-width: 400px;
	}
	
	.modal .modal-header, .modal .modal-body, .modal .modal-footer {
		padding: 20px 30px;
	}
	
	.modal .modal-content {
		border-radius: 3px;
	}
	
	.modal .modal-footer {
		background: #ecf0f1;
		border-radius: 0 0 3px 3px;
	}
	
	.modal .modal-title {
		display: inline-block;
	}
	
	.modal .form-control {
		border-radius: 2px;
		box-shadow: none;
		border-color: #dddddd;
	}
	
	.modal textarea.form-control {
		resize: vertical;
	}
	
	.modal .btn {
		border-radius: 2px;
		min-width: 100px;
	}
	
	.modal form label {
		font-weight: normal;
	}

</style>



<script type="text/javascript">
	
$(document).ready(function(){
	
	/*-------------------------< Menu JS >---------------------------*/
	
	//add active class on menu
	$('.menu ul li').click(function(e) {
		e.preventDefault();
		$('li').removeClass('active');
		$(this).addClass('active');
	});
	
	
	/*-------------------------< Table JS >---------------------------*/
	
	// Activate tooltip
	$('[data-toggle="tooltip"]').tooltip();
	
	// Select/Deselect checkboxes
	var checkbox = $('table tbody input[type="checkbox"]');
	$("#selectAll").click(function(){
		if(this.checked){
			checkbox.each(function(){
				this.checked = true;                        
			});
		} else{
			checkbox.each(function(){
				this.checked = false;                        
			});
		} 
	});
	checkbox.click(function(){
		if(!this.checked){
			$("#selectAll").prop("checked", false);
		}
	});
	
});

	/*-------------------------< Table JS >---------------------------*/
	
	$(document).ready(function(){
  		$("#filterInput").on("keyup", function() {
    		var value = $(this).val().toLowerCase();
    		$("#tableEployee tr").filter(function() {
      			$(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    		});
  		});
	});
	
	
	$(document).ready(function () {
		  $('#tableEployee').DataTable({
		    "paging": true // false to disable pagination (or any other option)
		  });
		  //$('.dataTables_length').addClass('bs-select');
		});
	
</script>


</head>



<body>

	<!-- -------------------------< Menu html >----------------------- -->

	<div class="menuContainer">
		<nav class="menu">
			<ul>
				<li class="active"><a href="#"><i class="fa fa-home" style="font-size:15px;"></i>    Home</a></li>
				<li><a href="#"><i class="fa fa-product-hunt" style="font-size:15px;"></i> Projects</a></li>
				<li><a href="#"><i class="fa fa-users"  style="font-size:15px;"></i>  Employees</a></li>
				<li><a href="#"><i class="fa fa-thumb-tack" style="font-size:15px;"></i>  Tasks</a></li>
				<li style="float: right;"><a href="#"><i class="fa fa-sign-out" style="font-size:15px;"></i> Log Out</a></li>

			</ul>
		</nav>
	</div>

	<!-- -------------------------< Table html >----------------------- -->

    <div id="tableContainer" class="tableContainer">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-6" style="height: 33px;">
						<h2>Manage <b>Employees</b></h2>
						<input class="form-control col-sm-5" id="filterInput" type="text" placeholder="Search.." style="width:50%; left:250px; top:-30px">
					</div>
					
					<div class="col-sm-6">
						<button id="addEmployee" onclick="showAddEmployeeForm()" class="btn btn-success" ><i class="material-icons">&#xE147;</i> <span>Add New Employee</span></button>
						<a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>						
					</div>
                </div>
            </div>
            <table id="tableEployee" class="table table-striped table-hover">
                <thead>
                    <tr>
						<th>
							<span class="custom-checkbox">
								<input type="checkbox" id="selectAll">
								<label for="selectAll"></label>
							</span>
						</th>
						<th>Number</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Grade</th>
						<th>Profile</th>
                        <th>Integration Date</th>
                        <th>Email</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
						<td>
							<span class="custom-checkbox">
								<input type="checkbox" id="checkbox1" name="options[]" value="1">
								<label for="checkbox1"></label>
							</span>
						</td>
						<td class="1">7894</td>
                        <td class="1">Thomas</td>
                        <td class="1">Hardy</td>
                        <td class="1">CJ</td>
						<td class="1">Devlopper</td>
                        <td class="1">12-04-1996</td>
                        <td class="1">thomashardy@mail.com</td>
                        <td class="1" hidden>99999</td>
                        <td>
                            <a id="editEmployee" onclick="showEditEmployeeForm('1')" class="edit" data-toggle="modal" style="cursor: pointer;" cursor: pointer;><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                            <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                        </td>
                    </tr>
                    
                </tbody>
            </table>
			<div class="clearfix">
                <div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>
                <ul class="pagination">
                    <li class="page-item disabled"><a href="#">Previous</a></li>
                    <li class="page-item  active"><a href="#" class="page-link">1</a></li>
                    <li class="page-item"><a href="#" class="page-link">2</a></li>
                    <li class="page-item"><a href="#" class="page-link">3</a></li>
                    <li class="page-item"><a href="#" class="page-link">4</a></li>
                    <li class="page-item"><a href="#" class="page-link">5</a></li>
                    <li class="page-item"><a href="#" class="page-link">Next</a></li>
                </ul>
            </div>
        </div>
    </div>
    

    
	<div id="successMessage" class="alert alert-success" style="display: none">
	</div>
	
	<div id="errorMessage" class="alert alert-danger" style="display: none">
	</div>
	
	
	
	
    <!-- ---------------------------<Add Employee-------------------------- -->
    
    <div id="addEmployeeFormDiv" class="tableContainer" style="display:none">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-6">
						<h2>Add <b>Employees</b></h2>
					</div>
					<div class="col-sm-6">
						<button id="addEmployee" onclick="showEmployeeList()" class="btn btn-success" ><i class="fa fa-list-ul" aria-hidden="true"></i><span>Employee List</span></button>					
					</div>
                </div>	
            </div>
            
            <form action="addEmployee" method="post">
	            <div id="addEmployeeForm" class="row" style="position:center">
	            	<div class="column" style="padding: 20px">
				        <div class="form-group">
							<label>Number</label>
							<input id="number" name="number" type="number" class="form-control" value="111" required>
						</div>
						<div class="form-group">
							<label>Last Name</label>
							<input id="lastName" name="lastName" type="text" class="form-control" value="bbb" required>
						</div>
						<div class="form-group">
							<label>profile</label>
							<select id="profile" name="profile" class="form-control">
								<option class="form-control">USER</option>
								<option class="form-control">ADMIN</option>
							</select>
							<!--<input id="profile" name="profile" type="text" class="form-control" value="ccc" required>  -->
						</div>
						<div class="form-group">
							<label>Email</label>
							<input id="email" name="email" type="email" class="form-control" value="dd@ddd.dd" required>
						</div>
						
						<button id="addEmployeeButton" class="btn btn-success"><i class="fa fa-plus-circle" aria-hidden="true"></i> <span class="inline-block align-middle" >Add Employee</span></button>				
	
					</div>
					
					<div class="column" style="padding: 20px">
						<div class="form-group">
							<label>First Name</label>
							<input id="firstName" name="firstName" type="text" class="form-control" value="eee" required>
						</div>
						<div class="form-group">
							<label>Grade</label>
							<select id="grade" name="grade" class="form-control">
								<option class="form-control">CJ</option>
								<option class="form-control">CD</option>
								<option class="form-control">CSD</option>
								<option class="form-control">CLD</option>
								
							</select>
							<!-- <input id="grade" name="grade" type="text" class="form-control" value="fff" required> -->
						</div>
						<div class="form-group">
							<label>Intergration Date</label>
							<input id="intergrationDate" name="intergrationDate" type="date" class="form-control" value="01/10/2020" required>
						</div>
	
						<div class="form-group">
							<label>Password</label>
							<input id="password" name="password" type="password" class="form-control" value="kkk" required>
						</div>
	
					</div>
					</div>
				</form>

				
			</div>            
        </div>        
    
    
    
    
    
    <!-- ---------------------------<Edit Employee-------------------------- -->
    
    <div id="editEmployeeFormDiv" class="tableContainer" style="display:none">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-6">
						<h2>Add <b>Employees</b></h2>
					</div>
					<div class="col-sm-6">
						<button id="addEmployee" onclick="showEmployeeList()" class="btn btn-success" ><i class="fa fa-list-ul" aria-hidden="true"></i><span>Employee List</span></button>					
					</div>
                </div>	
            </div>
            
            <form action="editEmployee" method="post">
	            <div id="editEmployeeForm" class="row" style="position:center">
	            	<div class="column" style="padding: 20px">
				        <div class="form-group">
							<label>Number</label>
							<input id="numberEdited" name="number" type="text" class="form-control" value="" required>
						</div>
						<div class="form-group">
							<label>Last Name</label>
							<input id="lastNameEdited" name="lastName" type="text" class="form-control" value="" required>
						</div>
						<div class="form-group">
							<label>profile</label>
							<input id="profileEdited" name="profile" type="text" class="form-control" value="" required>
						</div>
						<div class="form-group">
							<label>Email</label>
							<input id="emailEdited" name="email" type="email" class="form-control" value="" required>
						</div>

						<button id="editEmployeeButton" class="btn btn-warning" ><i class="fa fa-floppy-o" aria-hidden="true"></i> <span class="inline-block align-middle" >Edit Employee</span></button>					
	
					</div>
					
					<div class="column" style="padding: 20px">
						<div class="form-group">
							<label>First Name</label>
							<input id="firstNameEdited" name="firstName" type="text" class="form-control" value="" required>
						</div>
						<div class="form-group">
							<label>Grade</label>
							<input id="gradeEdited" name="grade" type="text" class="form-control" value="" required>
						</div>
						<div class="form-group">
							<label>Intergration Date</label>
							<input id="intergrationDateEdited" name="intergrationDate" type="text" class="form-control" value="" required>
						</div>
	
						<div class="form-group">
							<label>Password</label>
							<input id="passwordEdited" name="password" type="text" class="form-control" value="" required>
						</div>
						</div>
					</div>
				</form>

				
			</div>            
        </div>        
    </div>
    
    

	
	
	<!-- Delete Modal HTML -->
	<div id="deleteEmployeeModal" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<form>
					<div class="modal-header">						
						<h4 class="modal-title">Delete Employee</h4>
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">					
						<p>Are you sure you want to delete these Records?</p>
						<p class="text-warning"><small>This action cannot be undone.</small></p>
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
						<input type="submit" class="btn btn-danger" value="Delete">
					</div>
				</form>
			</div>
		</div>
	</div>
	
	

	<!-- Footer -->
	<footer class="page-footer font-small mdb-color lighten-3 pt-4">
	  <div class="footer-copyright text-center py-3">© 2020 Copyright:
	    <a href=""> TaskManagement.com</a>
	  </div>
	</footer>
	<!-- Footer -->
	
</body>




    <script>
    

    </script>

</html>
