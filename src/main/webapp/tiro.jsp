<%-- 
    Document   : tiro
    Created on : 16-jun-2021, 16:16:16
    Author     : DAW-A
--%>

<%@page import="modelo.Coordenada"%>
<%@page import="modelo.Tiro"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tiro Parabolico</h1>
        <%
            ArrayList<String> listaAngulos = ( ArrayList<String> ) request.getAttribute("listaAngulos");
             ArrayList<Coordenada> getCoordenadas = ( ArrayList<Coordenada> ) request.getAttribute("getCoordenadas");

            
            Tiro miTiro = ( Tiro ) request.getAttribute("miTiro");

            double veloinic=0;
            int angParab=12;
            if ( miTiro!=null) {
                    veloinic=miTiro.getVeloinic(); 
                    angParab=miTiro.getAngulo();
                }

        %>
        <form action="Servlettiro" method="post">
            <p><label>Velocidad(m/s):</label><input type="text" name="veloinic" value="<%=veloinic%>"></p>
           <p><label>Angulo:</label>
                    <select name="angParab">
                         <%

                            for ( String a: listaAngulos ){
                              String cadenaSelected="";
                              if ( Integer.parseInt(a)==angParab){
                                  cadenaSelected = " selected ";
                              }
                              out.println("<option value=" + a + cadenaSelected + ">" + a + "</option>" );
                          }
                           %>

                    </select>
                </p>
            <input type="submit" value="Calcular">
        </form>
        <h1>El Alcance es: ${miTiro.alcancemax}</h1>
        <h1>La altura maxima es: ${miTiro.alturamax}</h1>
        <% if(getCoordenadas!=null){
                    out.print("<table style='border:2px solid black'>"
                               +"<tr>"
                            +   "<td>X</td>"
                            +   "<td>Y</td>"
                            + "</tr>");
                    for( Coordenada v:getCoordenadas){
                        out.print("<tr>"
                                + "<td>"+v.getX()+"</td>"
                                + "<td>"+v.getY()+"</td>"
                            + "</tr>");
                    }
               }%>
    </body>
</html>
