<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="resources/index.css">
    <title>Квест</title>
</head>
<body>

<div class="container">
    <h1>Квест</h1>
    <p>Здесь должен быть какой-то текст</p>
    <form action="${pageContext.request.contextPath}/init" method="post">
        <input type="text" name="name" placeholder="Ваше имя" />
        <button type="submit">OK</button>
    </form>
</div>
</body>
</html>