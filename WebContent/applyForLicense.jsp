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
<script type="text/javascript">
	(function(e, t, n) {
		var r = e.querySelectorAll("html")[0];
		r.className = r.className.replace(/(^|\s)no-js(\s|$)/, "$1js$2")
	})(document, window, 0);

	function clear(name) {
		document.getElementsByName(name)[0].value = '';
	}
	function formValidate() {
		if (form1.fullname.value === "" || form1.fullname.value.length < 5) {
			alert("Please Enter Full Name");
			form1.fullname.style = "border-color:red";
		} else if (form1.phnumber.value === ""
				|| form1.phnumber.value.length < 10) {
			alert("Please Enter Phone Number");
			form1.phnumber.style = "border-color:red";
		} else if (form1.address.value === "") {
			alert("Please Enter Address");
			form1.address.style = "border-color:red";
		} else if (form1.city.value === "") {
			alert("Please Enter City");
			form1.city.style = "border-color:red";
		} else if (form1.pin.value === "") {
			alert("Please Enter PIN Code");
			form1.pin.style = "border-color:red";
		} else if (form1.photo.value === "") {
			alert("Please select your passport size photo");
			form1.photo.style = "border-color:red";
		} else if (form1.blood.value == 0) {
			alert("Please Select Blood Group");
			form1.blood.style = "border-color:red";
		} else if (form1.eyeCertificate.value === "") {
			alert("Please select your Eyefitness Certificate");
			form1.eyeCertificate.style = "border-color:red";
		} else if (form1.idcard.value === "") {
			alert("Please Select ID-Proof");
			form1.idcard.style = "border-color:red";
		} else {
			return true;
		}
		return false;
	}
</script>
<style type="text/css">
th, td {
	width: 150px;
	text-align: center;
	padding: 5px
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
				<h3 class="tittle">Driver's License Registration</h3>
				<div class="student-grids">
					<div>
						<form name="form1" action="applyForLicense" method="post"
							enctype="multipart/form-data" onsubmit="return formValidate();">
							<div class="align-center">

								<table width="400">
									<tr>
										<td>Full Name</td>
										<td><input type="text" name="fullname"
											onfocus="this.value=''" class="form-control"></td>
									</tr>

									<tr>
										<td>Email</td>
										<td><input type="email" name="email"
											onfocus="this.value=''" class="form-control"></td>
									</tr>

									<tr>
										<td>Phone Number:</td>
										<td><input type="tel" name="phnumber"
											onfocus="this.value=''" class="form-control"></td>
									<tr>
										<td>Address:</td>
										<td><input type="text" name="address"
											onfocus="this.value=''" class="form-control"></td>
									</tr>
									<tr>
										<td>City/State:</td>
										<td><input type="text" name="city"
											onfocus="this.value=''" class="form-control"></td>
									</tr>
									<tr>
										<td>Pin:</td>
										<td><input type="text" name="pin" onfocus="this.value=''"
											class="form-control"></td>
									</tr>

									<tr>
										<td>Select category of vehicle</td>

										<td><select name="licensetype" class="form-control"
											class="form-control">
												<option value='0'>Select type of vehicle</option>
												<option value="LMV">LMV</option>
												<option value="MCWG">MCWG</option>
												<option value="MCWoG">MCWoG</option>
												<option value="HPMV">HPMV</option>
												<option value="HGMV">HGMV</option>
										</select></td>
									</tr>

									<tr>
										<td>Passport size Phone:</td>
										<td>

											<div class="box">
												<input type="file" name="photo" id="file-1"
													class="form-control" />
											</div>
										</td>
									</tr>
									<tr>
										<td>Blood Group:</td>
										<td><select name="blood" class="form-control">
												<option value='0'>Select Blood Group</option>
												<option value='a+'>A+ve</option>
												<option value='b+'>B+ve</option>
												<option value='o+'>O+ve</option>
												<option value='ab+'>ab+</option>
												<option value='a-'>A-ve</option>
												<option value='b-'>B-ve</option>
												<option value='o-'>O-ve</option>
												<option value='ab-'>AB-ve</option>
										</select></td>
									</tr>
									<tr>
										<td>Eye fitness Certificate:</td>
										<td>

											<div class="box">
												<input type="file" name="eyeCertificate"
													class="form-control" />
											</div>
										</td>
									</tr>
									<tr>
										<td>ID Card:</td>
										<td>

											<div class="box">
												<input type="file" name="idcard" class="form-control" />
											</div>
										</td>
									</tr>

									<tr>
										<td></td>
										<td>
											<button type="submit" name="submit" class="btn btn-primary">Submit</button>
										</td>
									</tr>
								</table>
							</div>
						</form>
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
</html>