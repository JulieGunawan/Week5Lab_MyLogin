<%-- 
    Document   : login
    Created on : Oct 7, 2020, 2:54:42 PM
    Author     : 751682
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="get">
            Username: <input type="text" name="username" required> <br>
            Password: <input type="password" name="pass" required> <br>
            <input type="submit" value="Log in">
        </form>
    </body>
</html>
