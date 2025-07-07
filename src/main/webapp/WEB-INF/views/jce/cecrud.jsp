<%@ page language = "java" contentType = "text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

</head>
<body>

<form action="/destination-add" method="post">
<input name="dt_name" type="text" placeholder="name">
<input name="dt_address" type="text" placeholder="address">
<input name="dt_image" type="text" placeholder="image">
<input name="dt_mbti_category" type="text" placeholder="mbti">
<input name="dt_location_no" type="text" placeholder="location_no">
<button>[CREATE]</button>

</form>
<a href="/destination-all">[READ]</a>




</body>
</html>