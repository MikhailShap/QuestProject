<%--
  Created by IntelliJ IDEA.
  User: maxim
  Date: 31.10.2023
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Квест</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #ffffff;
            padding: 80px;
            border-radius: 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 800px;
        }

        button {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 30px 40px;
            border-radius: 20px;
            cursor: pointer;
            width: 100%;
            max-width: 200px;
            margin-top: 40px;
        }

        input[type="radio"] {
            margin: 20px 0;
        }

        .stats {
            font-size: 28px;
            color: red;
            margin-top: 40px;
        }
    </style>
</head>
<body>
<div class="container">
    <p> <%</p>
    <form action="someAction" method="post">
        <input type="radio" name="choice" value="refuse"> Да<br>
        <input type="radio" name="choice" value="accept"> Нет<br>
        <button type="submit">Ответить</button>
    </form>
    <div class="stats">
        IP address: <%=request.getRemoteAddr()%><br>
        Имя в игре: <%=session.getAttribute("name")%><br>
        Количество игр: 11
    </div>
</div>
</body>
</html>
