<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 23, 2021, 8:54:59 PM
    Author     : 775262
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST">
            <label>First: </label>
            <input type="text" name="fNum" value=${fNum}>
            <br>
            <label>Second: </label>
            <input type="text" name="sNum" value=${sNum}>
            <br>
            <input type="submit" value="+" name="ari">
            <input type="submit" value="-" name="ari">
            <input type="submit" value="*" name="ari">
            <input type="submit" value="%" name="ari">
            
            <p>Result: ${result}</p>
        </form>
        <a href="./age">Age Calculator</a>
    </body>
</html>
