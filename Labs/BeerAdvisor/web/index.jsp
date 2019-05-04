<%--
  Created by IntelliJ IDEA.
  User: Babita
  Date: 5/4/2019
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Beer Advisor</title>
  </head>
  <body>
        <h1 align="center">Beer Selection Page</h1>
        <form method="post" action="SelectBeer.do">
          Select Beer Characterstics<p>
          Color:
          <select name = "color" size="1">
            <option value="light"> light </option>
            <option value="amber">amber</option>
            <option value="brown">brown</option>
            <option value="dark">dark</option>
          </select>
           </p>
          <br/><br/>
          <center>
            <input type="SUBMIT">
          </center>

        </form>
  </body>
</html>
