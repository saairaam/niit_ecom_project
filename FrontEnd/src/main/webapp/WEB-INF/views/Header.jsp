<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<title>smart mobiles</title>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1 height=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>
body{
background-image: url("https://colorlib.com/wp/wp-content/uploads/sites/2/wordpress-shopping-cart-plugins.png");
background-size:100%;
}
</style>
<body>
  <div class="jumbotron">
     <div class="container text-center">
      <h1>Online Store</h1>      
      <p>Mission, Vission & Values</p>
    </div>
 </div>
<div class="container">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="index">Smart Mobiles</a>
			</div>
			<c:if test="${!sessionScope.loggedIn }">
			<ul class="nav navbar-nav">
				
				<li><a href="aboutus" class="glyphicon glyphicon-user"> About Us</a></li>
				<li><a href="contactus" class="glyphicon glyphicon-earphone"> Contact Us</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="register" class= "glyphicon glyphicon-user"> Sign Up</a></li>
				<li><a href="login" class= "glyphicon glyphicon-log-in"> Sign In</a></li>
			</ul>
			</c:if>
			<c:if test="${sessionScope.loggedIn }">
				<c:if test="${sessionScope.role=='ROLE_ADMIN' }">
					<ul class="nav navbar-nav">
					
						<li><a href="category" class="glyphicon glyphicon-th"> Category</a></li>
						<li><a href="Supplier" class="glyphicon glyphicon-user"> Supplier</a></li>
						<li><a href="product" class="glyphicon glyphicon-th"> Product</a></li>
					</ul>
				</c:if>
				<c:if test="${sessionScope.role=='ROLE_USER' }">
					<ul class="nav navbar-nav">
						 
						<li><a href="<c:url value="/productCatalog"/>" class="glyphicon glyphicon-th"> Product</a></li>
						<li><a href="<c:url value="/cart"/>" class="glyphicon glyphicon-shopping-cart"> Cart</a></li>
						
					</ul>
				</c:if>
			</c:if>
			
			<div class="nav navbar-nav navbar-right">
				<c:if test="${sessionScope.loggedIn }">
					<font color="white" class="glyphicon glyphicon-user"> ${sessionScope.username }</font><br>
					<a href="perform_logout" class="glyphicon glyphicon-log-out" > Sign Out</a>
				</c:if>
			</div>
</div>
</nav>
</div>
</body>
