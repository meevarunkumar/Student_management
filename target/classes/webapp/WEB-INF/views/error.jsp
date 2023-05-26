<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 5/17/2023
  Time: 3:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
        }

        .error-container {
            max-width: 400px;
            height: 217px;
            margin: 317px auto;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .error-title {
            font-size: 24px;
            font-weight: bold;
            margin-bottom: 20px;
        }

        .error-message {
            font-size: 18px;
            color: #888;
        }
        .container{
            margin-left: 134px;
            margin-top: 30px;
        }
    </style>
</head>
<body>
<div class="error-container">
    <h1 class="error-title">Error 404 </h1>
    <p class="error-message"> Please Enter Correct Input as per instructions </p>
    <div class="container">
        <a class="btn btn-primary" href="?id=${student.id}"> Back </a>
    </div>
</div>

</body>
</html>
