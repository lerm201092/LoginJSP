<%-- 
    Document   : index
    Created on : 14/07/2019, 05:41:20 AM
    Author     : Luis Eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <style>
            p{
                margin: 2px 2px;
            }
        </style>
    </head>
    <body>
        <h1>..:: Login ::..</h1>
        
        <form action="ValidarUsuario" method="POST">
            <p><label for="user">Usuario</label></p>
            <p><input id="user" name="user" type="text" /></p>
            <br />
            <p><label for="pass">Contraseña: </label></p>
            <p><input id="pass" name="pass" type="password" /></p>
            <br />
            <p><input id="bt_enviar" name="bt_enviar" type="submit" value="Ingresar"></p>
        </form>
    </body>
</html>
