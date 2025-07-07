<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language = "java" contentType = "text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

</head>
<body>

<h1>Destination</h1>

<c:forEach items="${destinations}" var="d">
    <div>${d.dt_no}</div> <br>
    <div>${d.dt_name}</div> <br>
    <div>${d.dt_address}</div> <br>
    <div>${d.dt_image}</div> <br>
    <div>${d.dt_mbti_category}</div> <br>
    <div>${d.dt_location_no}</div> <br>
    <button onclick="location.href='destination-update?no=${d.dt_no}'">[UPDATE]</button>
    <button onclick="location.href='destination-delete?no=${d.dt_no}'">[DELETE]</button>
</c:forEach>




</body>
</html>