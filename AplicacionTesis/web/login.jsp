<%-- 
    Document   : Login
    Created on : 18/05/2014, 10:09:47 PM
    Author     : tigabytes-linux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="LoginServlet" method="post">
            <table>
                <tr>
                  <td>
                      <h3>Usuario</h3>  
                  </td>    
                  <td>  
                      <input type="text" size="30" name="usuario">
                  </td>
                </tr>  
                <tr>
                  <td>
                      <h3>Contraseña</h3>  
                  </td>    
                  <td>  
                      <input type="password" size="30" name="clave">
                  </td>
                </tr> 
                <tr>
                    <td>
                        <input type="submit" name="ingresar" value="Ingresar"> 
                    </td>                     
                </tr>                    
            </table>
    </body>
</html>