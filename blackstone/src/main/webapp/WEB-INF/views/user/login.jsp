<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<c:set var="userinfo" value="${sessionScope.userInfo}"/>
    
<!DOCTYPE html>
<html>
	<header>
		
		<title>BlackStone : login</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- CSS -->
		<!-- 
		<link rel="stylesheet"
			href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
		 -->
		<!-- JS -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
		<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700,800&amp;subset=korean" rel="stylesheet">
			<!--  변경 후 -->
		<script src="../resources/vendor/jquery/jquery.min.js"></script>
		<link href="../resources/css/sb-admin-2.min.css" rel="stylesheet">
		<script type="text/javascript">
			function 
		
		
		</script>
	</header>
	<body>
	<!-- header-->
		<%@ include file="/WEB-INF/views/header.jsp"%>
	
	<!-- content -->
	<form action="/user/login">
		아이디 : <input type = "text" name="uid">
		비밀번호 : <input type="password" name="password">
		<input type="submit" value="로그인">
	</form>
	
	<!-- footer -->	
		<%@ include file="/WEB-INF/views/footer.jsp"%>
	</body>
	
</html>