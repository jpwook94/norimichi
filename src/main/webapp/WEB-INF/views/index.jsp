<%@ page language = "java" contentType = "text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="resources/css/czcz.css">
</head>
<body>
<a href="/review-all">get all review</a>
<hr>
<form action="/review-add " method="POST">
    <div>
        <input type="text" placeholder="title" name="r_title">
        <input type="text" placeholder="content" name="r_txt">
        <button>add</button>


        <hr>
        <h1>index2 page</h1>
        <h1>title1 ~~~~~~~~  /  </h1>
        <h1 onclick="location.href='review-detail?no=20'">title2 ~~~~~~~~  /  </h1>
        <h1>title3 ~~~~~~~~  /  </h1>



            </body>
<canvas id="cakeCanvas" width="400" height="400"></canvas>
<script src="resources/js/czcz.js"></script>
</html>