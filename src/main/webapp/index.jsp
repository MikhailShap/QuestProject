<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <title>Квест</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f3f4f6;
        }

        .container {
            width: 60%;
            min-height: 400px;
            background-color: #ffffff;
            padding: 40px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
        }

        h1 {
            text-align: center;
            font-size: 2em;
        }

        p {
            text-align: center;
            font-size: 1.2em;
            margin-bottom: 30px;
        }

        input[type="text"] {
            display: block;
            margin: 0 auto;
            padding: 15px;
            font-size: 1.2em;
            width: 70%;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        button {
            display: block;
            margin: 30px auto;
            padding: 15px 30px;
            background-color: #4CAF50;
            color: #ffffff;
            border: none;
            cursor: pointer;
            font-size: 1.2em;
            border-radius: 5px;
        }

    </style>
</head>
<body>
<div class="container">
    <h1>Квест</h1>
    <p>Здесь будет какой-то текст</p>
    <form action="${pageContext.request.contextPath}/init" method="post">
        <input type="text" name="name" placeholder="Ваше имя" />
        <button type="submit">OK</button>
    </form>
</div>
</body>
</html>