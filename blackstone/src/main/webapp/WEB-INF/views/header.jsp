<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<c:set var="userinfo" value="${sessionScope.userInfo}" />

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<style type="text/css">
	#header{background-color: #FFE08C;}
	#header{margin-bottom:10px;}
	a#menu{text-decoration:none;display:none;}
	#nav{padding:0; margin:0; display:inline;}
	#nav li{display:inline;}
	
	@media screen and (max-width : 480px) 
	{
	#nav{display:none;}
	a#menu{display:inline;}
	a#menu:hover + #nav{display:inline;}
	}

</style>
</head>
<body>
<div id = "header">
		<a href="#" id="menu">
		 <img src="img/cuteBlackStone.png">
			
		</a>
		
		
		
		<div class="container-md container-lg container-sm">흑돌이</div>
		<ul id="nav">
			<li><a href="#"> Photo </a> &#10072;</li>
			<li><a href="#"> Board </a>&#10072;</li>	
			<li><a href="#"> Cost </a>&#10072;</li>
			<li><a href="#"> Login  </a>&#10072;</li>
			<li><a href="#"> Join </a>&#10072;</li>
		</ul>



</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
		crossorigin="anonymous"></script>
	<script type="text/javascript" src="src/main/resources/js/bootstrap.js"></script>

</body>
</html>
