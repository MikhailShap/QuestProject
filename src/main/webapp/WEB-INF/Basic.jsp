<%--
  Created by IntelliJ IDEA.
  User: maxim
  Date: 31.10.2023
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <link rel="stylesheet" href="../resources/Basic.css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8">
    <title>Квест</title>
</head>
<body>
<jsp:useBean id="Level" scope="session" type="com.javarush.quest.shaposhnikov.Levels.LevelQuest"/>
<div class="container">

    <c:if test="${ empty Level.answerOne}">
        <c:choose>

            <c:when test="${Level.defeat}">
                <p style="color: red;font-size: 30px;margin: 0">Ты проиграл</p>
            </c:when>
            <c:otherwise>
                <p style="color: green;font-size: 30px;margin: 0">Ты победил</p>
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
            <img src="${Level.pathToImage}" alt="Image"/>
        </div>
    </c:if>


    <c:if test="${ empty Level.answerOne}">
        <div class="container__content">
        <form action="${pageContext.request.contextPath}/restart" method="get">
            <button class="restartButton" type="submit">Начать заново</button>
        </form>
            <img src="${Level.pathToImage}" alt="Image"/>
        </div>
    </c:if>

    <div class="stats">
        Имя в игре: <%=session.getAttribute("name")%><br>
        Количество игр: <%=session.getAttribute("countGame")%>
    </div>
</div>
</body>
</html>
