<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script language="JavaScript" type="text/javascript" src="js/funciones.js"></script>  
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
        <script type="text/javascript">
            window.onload = relojDigital;
        </script> 
    </head>

    <body>

        <form class="contenedor" action="/AdminAsistencia" method="post">
            <div class="header">Módulo Académico</div><br>
            <div class="ciclo">Ciclo Académico 2014 - 2</div><br>  
            <div class="hora" id="liveclock"></div> 
            <br><br>
            <table>
                <tr>
                    <td class="texto">Curso a dictar:</td>   
                    <td style="size: 30px">
                        <select name="curso" onchange="enable()" >
                            <option value="0" selected>--Seleccione--</option>                            
                        </select>
                    </td> 
                    <td style="width: 80px"></td>
                    <td rowspan="2">
                        <input type="submit" value="Registrar"> 
                    </td>
                </tr>
                <tr>
                    <td class="texto">Clase a dictar:</td>
                    <td style="size: 30px">
                        <select name="clase" onchange="enable()" >
                            <option value="0" selected>--Seleccione--</option>                            
                        </select>
                    </td>      
                    
                </tr>
         
               

            </table>



        </form> 





    </body>
</html>
