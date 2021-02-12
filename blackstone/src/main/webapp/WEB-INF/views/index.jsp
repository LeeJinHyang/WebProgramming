<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>     
<c:set var="root" value="${pageContext.request.contextPath}"/>
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
<style>
.container {
	background-color: #cccccc;
}

.container-fluid {
	background-color: #dddddd;
}

h1 {
	margin: 100px 0px;
}

#contents{min-height:400px;width:80%;background:#E4F7BA;float:left}
#side{min-height:400px;}

@media screen and (max-width:480px){
#contents{width:auto;float:none;min-height:200px;margin-bottom:10px;}
#side{width:auto;min-height:0;}

}
</style>

</head>
<body>

<%@ include file="/WEB-INF/views/header.jsp"%>
	
<div id = "contents">
	<div class="container-fluid">

		<div class="row">
			<div class="col">
				<div>111</div>

			</div>
			<div class="col">
				<div>22</div>

			</div>
		</div>


	</div>

</div>

<div class="side">


</div>

	<!--  footer -->
	<footer>
		<%@ include file="/WEB-INF/views/footer.jsp"%>

	</footer>


	<!-- 반응형 레이아웃으로 헤더 만들 -->

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
		crossorigin="anonymous"></script>
	<script type="text/javascript" src="src/main/resources/js/bootstrap.js"></script>

</body>
</html>
