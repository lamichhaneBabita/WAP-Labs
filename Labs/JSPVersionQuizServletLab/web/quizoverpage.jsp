<%--
  Created by IntelliJ IDEA.
  User: Babita
  Date: 5/6/2019
  Time: 10:51 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>NumberQuiz</title>
  <script>
    function hintClick() {
      //e.preventDefault();
      alert(${quiz.getHint(quiz.getCurrentQuestionIndex())});

    }
  </script>
</head>
<body>
<form method='post'>

  <c:if test="${isValidAge=='N' || isValidAge==null}">
    <input type="text" name="txtAge" value=""/>
    <c:if test="${isValidAge=='N'}">
      <label style="color: red">Invalid Age.</label>
    </c:if>
    <p><input type='submit' value='Submit Age'/></p>
  </c:if>

  <c:if test="${isValidAge=='Y'}">
    <h3>Have fun with NumberQuiz!!</h3>
    <p>Your current score is:
        ${quiz.getNumberCorrect()} </p>

    <p>Guess the next number in the sequence! ${quiz.getCurrentQuestion()}</p>

    <input type='button' value='Hint' onclick="hintClick()" style="font-size: xx-small"/>

    <p>Your answer:<input type='text' name='txtAnswer' value=''/></p>

    <c:if test="${error && answer!=null}">

      <p style='color:red'>Your last answer was not correct! Please try again</p>

    </c:if>

    <p><input type='submit' value='Next'/></p>
  </c:if>
</form>
</body>
</html>
