<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<c:set var="userinfo" value="${sessionScope.userInfo}"/>

<!DOCTYPE html>
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/d73433e586.js" crossorigin="anonymous"></script>

    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@200;300&display=swap" rel="stylesheet">

    <style>
        body {
            margin: 0;
            font-family: 'Source Sans Pro';
        }

        a {
            text-decoration: none;
            color: white;
        }

        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background-color: #263343;
            padding: 8px 12px;
        }

        .navbar_logo {
            font-size: 24px;
            color: white;
        }

        .navbar_logo i {
            color: #d49466;
        }

        .navbar_menu {
            display: flex;
            list-style: none;
            padding-left: 0;
        }

        .navbar_menu li {
            padding: 8px 12px;
        }

        .navbar_menu li:hover {
            background-color: #d49466;
            border-radius: 4px;
        }

        .navbar_icons {
            list-style: none;
            color: white;
            display: flex;
            padding-left: 0;
        }

        .navbar_icons li {
            paddings: 8px 12px;
        }

        .navbar_toggleBtn {
            display: none;
            position: absolute;
            right: 32px;
            font-size: 24px;
            color: #d49466;
            position: absolute;
        }

        @media screen and (max-width: 768px) {
            .navbar {
                flex-direction: column;
                align-items: flex-start;
                padding: 8px 24px;
            }

            .navbar_menu {
                display: none;
                flex-direction: column;
                align-items: center;
                width: 100%;
            }

            .navbar_menu li {
                width: 100%;
                text-align: center;
            }

            .navbar_icons {
                display: none;
                justify-content: center;
                width: 100%;
            }

            .navbar_toggleBtn {
                display: block;
            }

            .navbar_menu.active,
            .navbar_icons.active {
                display: flex;
            }
        }
    </style>
</head>

<body>
<header>
    <%@ include file="/WEB-INF/views/header.jsp" %>
</header>


<div class="container">

    <div class="row">
        Gallery
    </div>
    <div class="row" id="photo" onchange="photoOn();"></div>

    <div class="row">
        Board
    </div>

    <div class="row">
        cost
    </div>

</div>


<!--  footer -->
<footer>
    <%@ include file="/WEB-INF/views/footer.jsp" %>
</footer>


<!-- 반응형 레이아웃으로 헤더 만들 -->

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
        crossorigin="anonymous"></script>
<script>
    function photoOn() {
        let path = [
            "img/blackstonePhoto/1.jpeg",
            "img/blackstonePhoto/4.jpeg",
            "img/blackstonePhoto/3.jpeg"
        ];
        $("#photo").append('<div class="col-sm-4" id="photoframe"><img src=' + path[0] + ' alt="..." class="img-thumbnail"></div>');
        $("#photo").append('<div class="col-sm-4" id="photoframe"><img src=' + path[1] + ' alt="..." class="img-thumbnail"></div>');
        $("#photo").append('<div class="col-sm-4" id="photoframe"><img src=' + path[2] + ' alt="..." class="img-thumbnail"></div>');
    }

    photoOn();
</script>
</body>

</html>