<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html class="no-js">
<head>
<meta charset="ISO-8859-1">
<link rel="shortcut icon" href="favicon.ico">
<link rel="stylesheet" type="text/css" href="css/component.css" />
<title>RTO Kerala</title>
<!--css-->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/ken-burns.css" type="text/css"
	media="all" />
<link rel="stylesheet" href="css/animate.min.css" type="text/css"
	media="all" />
<!--css-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="RTO WEB TEMPLATE" />
<script type="application/x-javascript">
	
	
	
addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
function viewForm(id){
	window.open("ViewRegistrationForm?id="+id,"View Form","wdth=200,height=200");
}
function approveRequest(id){
	window.location="ApproveRegistrationRequest?id="+id;
}
function rejectForm(id){
	window.location="RejectRegistrationForm?id="+id;
}


</script>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<!--js-->
<!--webfonts-->
<link href='//fonts.googleapis.com/css?family=Cagliostro'
	rel='stylesheet' type='text/css'>
<link
	href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic'
	rel='stylesheet' type='text/css'>
<!--webfonts-->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<style type="text/css">
table {
	border-collapse: collapse;
}

th {
	background-color: #a3ffc2;
}

th, td {
	text-align: center;
	border: 1px solid black;
	padding: 5px
}

.td-s {
	border-right: hidden;
}

.table-s {
	border-collapse: separate;
	border-spacing: 0 15px;
}

h1 {
	color: green;
}
</style>
</head>
<body>
	<div class="header">
		<div class="container">
			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<!---Brand and toggle get grouped for better mobile display--->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<div class="navbar-brand">
							<h1>
								<a href="index.jsp">RTO <span>Kerala</span></a>
							</h1>
						</div>
					</div>


					<c:import url="header.jsp"></c:import>
				</div>
			</nav>
		</div>
	</div>
	<div class="content">

		<c:if test="${forms ne null}">
			<table class="table-s">
				<tr>
					<th width=5%>Reg_no</th>
					<th width=15%>Name</th>
					<th width=20%>Number</th>
					<th width=22%>Email</th>
					<th colspan="3">Operations</th>
				</tr>
				<c:forEach items="${forms}" var="form">
					<tr>
						<td>${form.getId() }</td>
						<td>${form.getFullName()}</td>
						<td>${form.getNumber()}</td>
						<td>${form.getEmail() }
						<td><button class="btn btn-primary"
								onClick="viewForm('${form.getId()}')">View</button>
						<td><button class="btn btn-primary"
								onClick="approveRequest('${form.getId()}')">Approve</button>
						<td><button class="btn btn-primary"
								onclick="rejectForm('${form.getId()}')">Reject</button>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>

	<!---copy--->
	<div id="message" style="display: none;">Sending Email.....</div>
	<div class="copy-section">
		<div class="container">
			<div class="social-icons">
				<a href="#"><i class="icon1"></i></a> <a href="#"><i
					class="icon2"></i></a> <a href="#"><i class="icon3"></i></a> <a
					href="#"><i class="icon4"></i></a>
			</div>
		</div>
	</div>
	<!---copy--->
	<script src="js/custom-file-input.js"></script>
</body>

</html>