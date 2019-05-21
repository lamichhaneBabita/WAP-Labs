<%--
  Created by IntelliJ IDEA.
  User: Babita
  Date: 5/20/2019
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Online Dictionary</title>
    <link href="./Online_dictionary_files/dict.css" type="text/css" rel="stylesheet">

    <!-- provided JS (no need to modify) -->
    <script src="./Online_dictionary_files/jquery.min.js.download" type="text/javascript"></script>

    <!-- you write this -->
    <script src="./Online_dictionary_files/dict.js" type="text/javascript"></script>
  </head>

  <body data-gr-c-s-loaded="true">
  <h1>Online Dictionary Lookup</h1>

  <div id="controls">
    Term:
    <input id="term" type="text" value="type here" autofocus="autofocus">
    <button id="lookup">Lookup</button>
  </div>

  <div id="result">
    <!-- definition(s) will appear here -->
  </div>

  <div id="related">
    <!-- other words for same author will appear here, later (JSON) -->
  </div>

  <div id="w3c">
    <a href="https://webster.cs.washington.edu/validate-html.php">
      <img src="./Online_dictionary_files/w3c-html.png" alt="Valid HTML"></a>
    <a href="https://webster.cs.washington.edu/validate-css.php">
      <img src="./Online_dictionary_files/w3c-css.png" alt="Valid CSS"></a>
    <a href="https://webster.cs.washington.edu/jslint/?referer">
      <img src="./Online_dictionary_files/w3c-js.png" alt="Valid JS"></a>
  </div>


  </body></html>