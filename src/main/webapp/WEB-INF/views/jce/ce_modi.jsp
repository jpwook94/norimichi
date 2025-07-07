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

<h1>Destination Detail</h1>

<%-- d 수정해야함--%>

<form action="/destination-update?no=${destinations.dt_no}" method="post">

    <div>${destinations.dt_no}</div> <br>
    <div>Name : <input name="dt_name" type="text" value="${destinations.dt_name}"></div> <br>
    <div>Address : <input name="dt_address" type="text" value="${destinations.dt_address}"></div> <br>
    <div>Image : <input name="dt_image" type="text" value="${destinations.dt_image}"></div> <br>
    <div>Mbti : <input name="dt_mbti_category" type="text" value="${destinations.dt_mbti_category}"></div> <br>
    <div>Location_no : <input name="dt_location_no" type="text" value="${destinations.dt_location_no}"></div> <br>

    <button name="dt_no" value="${destinations.dt_no}">[UPDATE]</button>
</form>





</body>
</html>