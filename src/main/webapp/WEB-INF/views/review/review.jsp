<%@ page language = "java" contentType = "text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h1>review</h1>
<%--        ${reviews}--%>
        <c:forEach items="${reviews}" var="r">
            <div>${r.r_no} / ${r.r_title} / ${r.r_txt} / ${r.r_date}</div>
        </c:forEach>
</body>
</html>