<%--
  Created by IntelliJ IDEA.
  User: Babita
  Date: 5/7/2019
  Time: 11:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<table>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Lecture 5</title>
    </head>
    <body>
    <table>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.name}</td>
                <td>${student.age}</td>
            </tr>
        </c:forEach>
    </table>
    </body>
</html>