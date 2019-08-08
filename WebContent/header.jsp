<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<nav class="link-effect-2" id="link-effect-2">

							<c:if test="${admin eq null}">
								<ul class="nav navbar-nav">
								<li><a href="index.jsp"><span
											data-hover="Home">Home</span></a> </li>
									<li><a href="applyForLicense.jsp"><span
											data-hover="Driving License">Driving License</span></a> </li>
									<li><a href="vehicleRegistration.jsp"><span
											data-hover="Registration">Registration</span></a> </li>
									<li><a href="checkAvailableNumber.jsp"><span
											data-hover="Check Available Number">Check Available
												Number</span></a> </li>
									<li><a href="complaints.jsp"><span
											data-hover="Complaints">Complaints</span></a></li>
								</ul>
							</c:if>
							<c:if test="${admin ne null}">
								<ul class="nav navbar-nav">
								<li><a href="index.jsp"><span
											data-hover="Home">Home</span></a> </li>
									<li><a href="VerifyLicense"><span
											data-hover="Verify License">Verify License</span></a> </li>
									<li><a href="VehicleRegistration"><span
											data-hover="Vehicle Registration">Vehicle Registration</span></a>
										</li>
									<li><a href="ViewComplaints"><span
											data-hover="Complaints">Complaints</span></a></li>
								</ul>
							</c:if>
						</nav>
					</div>
</body>
</html>