<%-- 
    Document   : agecalculator
    Created on : Sep 23, 2021, 4:04:46 PM
    Author     : 775262
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <label>Enter your age: </label>
            <input type="text" name="age_input" value=${mAge}>
            <br>
            <input type="submit" value="Age next birthday">
            <br>
            <span>${message}</span>
            <br>
        </form>
        <a href="./arithmetic">Arithmetic Calculator</a>
    </body>
</html>
