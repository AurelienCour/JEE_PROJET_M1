<%--Document: interfaceCreated on : 6 avr. 2017, 11:26:20Author: Jonathan--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="../CSS/Style.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Puissance 4</title>
    </head>
    <body>
        <jsp:useBean id="jeu" class="PackageJava.JeuPuissance4" scope="session" />
        <table>
            <%for (int line = 1; line<=6; line++) {%>
            <tr>
                <%for (int col = 1; col<=7; col++) {%>
                <form method="get" action="jeu.jsp">
                    <td>
                        <input type="hidden" value=<%=col%> name="colonne">
                        <input type="submit" value="" name="A1" class="bouton_puissance">
                    </td>
                </form>
                <%}
            }%>
            </tr>
        </table>
        <div>
            <%out.println(request.getParameter("colonne"));
            String nombreEntre = request.getParameter("colonne");
            if (nombreEntre != null)
                out.println("Vous avez entré = "+nombreEntre+"<br>");
            else
                out.println("Vous n'avez pas encore rentré de valeur <br>");
            %>
        </div>
    </body>
</html>

