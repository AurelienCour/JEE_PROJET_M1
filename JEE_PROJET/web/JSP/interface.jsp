<%-- 
    Document   : interface
    Created on : 6 avr. 2017, 11:26:20
    Author     : Jonathan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Puissance 4</title>
    </head>
    <body>
        <jsp:useBean id="game" class="PackageJava.JeuPuissance4" scope="session"/>
        <table>
            <%
                for (int col = 1; col<=6; col++) {
            %>
            <tr>
                <%
                    for (int line = 1; line<=7; line++) {
                %>
                <td> 
                    <% 
                        int r = col*line;
                    %>
                    <input type="submit" value="<%out.println(r);%>" name="A1">
                </td>
                <%
                    }
                }
                %>
            </tr>
        </table>
    </body>
</html>
