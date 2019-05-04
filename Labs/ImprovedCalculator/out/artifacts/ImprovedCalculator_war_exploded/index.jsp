<%--
  Created by IntelliJ IDEA.
  User: Babita
  Date: 5/3/2019
  Time: 7:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language= "java" %>
<html>
  <head>
    <title>Improved Calculator</title>
  </head>
  <body>
  <form method="post" action="impCalculate">
    <input type="text" name="add_op1" value="${add_op1}"/>+<input type="text" name="add_op2" value="${add_op1}"/>=<input type= "text" value="${result}"/> <br/><br/>
    <input type="text" name="mul_op1" value="${mul_op1}"/>*<input type="text" name="mul_op2" value="${mul_op2}"/>=<input type="text"  value="${result1}"/><br/><br/>
    <input type="submit"/>
  </form>
  </body>
</html>
