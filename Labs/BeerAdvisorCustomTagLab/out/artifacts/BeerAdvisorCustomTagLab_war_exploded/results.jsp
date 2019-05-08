%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%--
  Created by IntelliJ IDEA.
  User: Babita
  Date: 5/8/2019
  Time: 12:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/functions" %>--%>
<html>
<head>
    <title>Beer Results</title>
</head>
<body>

<h1 align="center">Beer Reccomendations JSP</h1>
<c:forEach items="${styles}" var="style">
    <br>Try this beer: ${style}
</c:forEach>

<%--<%--%>
<%--List styles = (List) request.getAttribute("styles");--%>
<%--Iterator it = styles.iterator();--%>
<%--while (it.hasNext()) {--%>
<%--out.print("<br> try this: " + it.next());--%>
<%--}--%>
<%--%>--%>





</body>
</html>
