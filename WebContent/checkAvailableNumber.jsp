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

.input-text{
border-style : double;
width:50%;
	height: 32px;
	border-radius: 8px;
	
}
.center-box{
margin-left:30%;
	width: 50%;
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
		<!--banner-bottom-->

		<!--student-->
		<div class="student-w3ls">
			<div class="container">
				<h3 class="tittle">Check Available Number</h3>
				<div class="student-grids">
					<div class="center-box">
	
	<input type="text" id="number" class="input-text">
	<button id="searchbutton" class="btn btn-primary">Search</button>
	
	<div id="response"></div>
</div>

				</div>
			</div>
		</div>
	</div>
	<!--footer-->
	<div class="footer-w3">
		<div class="container">
			<div class="footer-grids">
				<div class="col-md-8 footer-grid">
					<h4>About Us</h4>
					<p>
						Organisation of the Indian government responsible for maintaining
						a database of drivers and a database of vehicles for Kerala.<span>
							It issues driving licences, organises collection of vehicle
							excise duty and sells personalised registrations. It also is
							responsible to inspect vehicle's insurance and clear the
							pollution test.</span>
					</p>
				</div>
				<div class="col-md-4 footer-grid">
					<h4>Information</h4>
					<ul>
						<li><i class="glyphicon glyphicon-map-marker"
							aria-hidden="true"></i>Thrupananthapuram</li>
						<li><i class="glyphicon glyphicon-earphone"
							aria-hidden="true"></i>080 2956789</li>
						<li><i class="glyphicon glyphicon-envelope"
							aria-hidden="true"></i><a href="mailto:Kerala@rto.com">
								Kerala@rto.com</a></li>
						<li><i class="glyphicon glyphicon-time" aria-hidden="true"></i>Mon-Sat
							10:00 hr to 17:00 hr</li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--footer-->
	<!---copy--->
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
<script>
	$(document).on("click", "#searchbutton", function() {
		/* $.get("CkeckAvailableNumber?num="+num, function(responseText) {   
			$("#response").text(responseText); }); */

		$.ajax({
			type : "POST",
			url : 'CkeckAvailableNumber',
			data : ({
				num : document.getElementById("number").value
			}),
			success : function(responseText) {
				$("#response").text(responseText);
			}
		});
	});
</script>
</html>