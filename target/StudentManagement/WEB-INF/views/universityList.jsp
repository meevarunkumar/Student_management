<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 5/15/2023
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page  contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>University Details </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <style>
        table{
            border-collapse: collapse;
            margin: auto;
        }
        th , td{
            border: 2px solid;
            padding: 5px;
            text-align: center;
        }
        .container {
            margin-left: 900px;
            margin-top: 100px;
        }
        button {
            border-radius: 5px;
            cursor: pointer;
            background-color: #0d6efd;
            color: white;
        }
        button:hover{
            background-color: black;
            color: white;
        }
        a{
            text-decoration: none;
            color: white;
        }

    </style>
</head>
<body>
<h1 align="center"> University Details </h1>
<table  >
    <tr>
        <th>  Id</th>
        <th>  Country </th>
        <th>  alpha_two_code </th>
        <th>  Name</th>

    </tr>
    <c:forEach  var="university" items="${ universities}">
        <tr>
            <td> ${university.id}</td>
            <td>${university.country}</td>
            <td>${university.alpha_two_code}</td>
            <td>${university.name}</td>
        </tr>
    </c:forEach >

</table>
<div class="container">
    <a class="btn btn-primary" href="home">  Home </a>
    <a class="btn btn-primary" href="home">  Back </a>
</div>


</body>
</html>
