<%-- 
    Document   : index
    Created on : 10/08/2015, 22:09:54
    Author     : 31400329
--%>
<%@page import="mack.entities.Usuario"%>
<%@page import="java.util.Collection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Usuário</h1>
        <% Collection<Usuario> usuarios = (Collection<Usuario>) request.getAttribute("usuarios");
        %>

        <% if (usuarios.size() > 0) {%>

        <table>

            <% for (Usuario u : usuarios) {%>
            <tr>
                <td><%=u.getId()%> </td>
                <td><%=u.getNome()%></td>
                <td><%=u.getSobrenome()%></td>
            </tr>
            <%}%>
        </table>
        <%}%>   
        <br />
        <a href="index.html">Voltar a Página Principal</a>
    </body>
</html>
