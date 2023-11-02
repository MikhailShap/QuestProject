<%@ page import="com.example.demo2.LevelQuest" %>
<%@ page import="org.apache.commons.lang3.StringUtils" %><%--
  Created by IntelliJ IDEA.
  User: maxim
  Date: 31.10.2023
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            font-size: ;
        }

        .container {
            background-color: #ffffff;
            padding: 20px 50px;
            border-radius: 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 830px;
            max-width: 800px;
            min-width: 800px;
            max-height: 530px;
            min-height: 530px;
            display: flex;
            flex-direction: column;
        }
        label{
            font-size: 18px;
        }

        button {
            background-color: #4CAF50;
            font-size: 20px;
            color: white;
            border: none;
            padding: 20px 30px;
            border-radius: 20px;
            cursor: pointer;
            width: 100%;
            max-width: 200px;
            margin-top: 40px;
        }
        .restartButton{
           max-width: 250px;
            padding: 20px 30px;
        }

        input[type="radio"] {
            margin: 20px 0;
        }

        .stats {
            font-size: 23px;
            color: #235095;
            margin-top: auto;
        }

.container__content {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;
    width: 100%;
    margin-top: auto;
}
img {
    width: 100%;
    max-width: 300px;
}
    </style>
</head>
<body>
<jsp:useBean id="Level" scope="session" type="com.example.demo2.LevelQuest"/>
<div class="container">

    <c:if test="${ empty Level.answerOne}">
        <c:choose>

            <c:when test="${Level.defeat}">
                <p style="color: red;font-size: 30px">Ты проиграл</p>
            </c:when>
            <c:otherwise>
                <p style="color: green;font-size: 30px">Ты победил</p>
            </c:otherwise>
        </c:choose>

    </c:if>

    <p style="font-size: 20px">${Level.question}</p>

    <c:if test="${not empty Level.answerOne}">
        <div class="container__content">
            <form action="${pageContext.request.contextPath}/quest" method="post">
                <input type="radio" id="choiceOne" name="choice" value="${Level.answerOne}">
                <label for="choiceOne">${Level.answerOne}</label><br>

                <input type="radio" id="choiceTwo" name="choice" value="${Level.answerTwo}">
                <label for="choiceTwo">${Level.answerTwo}</label><br>

                <button class="submitButton" type="submit">Ответить</button>
            </form>
            <img src="../images/Im1.png"/>
        </div>
    </c:if>


    <c:if test="${ empty Level.answerOne}">
        <form action="${pageContext.request.contextPath}/restart" method="get">
            <button class="restartButton" type="submit">Начать заново</button>
        </form>
    </c:if>

    <div class="stats">
        Имя в игре: <%=session.getAttribute("name")%><br>
        Количество игр: <%=session.getAttribute("countGame")%>
    </div>
</div>
</body>
</html>
