<%-- 
    Document   : index
    Created on : 10/08/2015, 22:26:54
    Author     : 31400329
--%>
<%@page import="mack.entities.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% Usuario usuario = (Usuario) request.getAttribute("usuario");
        %>

        <% if (usuario != null) {%>

        <h1>Usuário</h1>

        <table>

            <tr>
                <td><%=usuario.getId()%> </td>
                <td><%=usuario.getNome()%></td>
                <td><%=usuario.getSobrenome()%></td>
            </tr>

        </table>
        <%}%>
        <br />
        <a href="index.html">Voltar a Página Principal</a>
    </body>
</html>
