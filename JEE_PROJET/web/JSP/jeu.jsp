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
        <%
        String reset = request.getParameter("B2");
        if(reset!=null){
            jeu.initialisation();
        }
        int win = jeu.vainqueur();
        
        if(jeu.statut() == "finie" && win != 0){
            %><h1>FINI LE VAINQUEUR EST LE <%=win%></h1><%
        }else if(jeu.statut() == "finie"){
            %><h1>EGALITE !</h1><%
        }else{
            String nombreEntre = request.getParameter("colonne");
            if (nombreEntre != null){
                int numb = Integer.parseInt(nombreEntre);
                if(jeu.statut() == "joueur1"){
                    if(!jeu.action(1, numb)){
                        %><h1> Colonne pleine</h1><%
                    }
                }else if(jeu.statut() == "joueur2"){
                    if(!jeu.action(2, numb)){
                        %><h1> Colonne pleine</h1><%
                    }
                }
           }
           else
                out.println("Vous n'avez pas encore rentré de valeur <br>");
        }
        
        %>
        <table>
            <%for (int line = 0; line<6; line++) {%>
            <tr>
                <%for (int col = 0; col<7; col++) {%>
                <form method="get" action="jeu.jsp">
                    <td>
                        <input type="hidden" value=<%=col%> name="colonne">
                        <% if(jeu.getJoueurPion(col,line) == 1){%>
                            <input type="submit" value="" name="A1" class="bouton_puissanceRouge">
                        <% }else if(jeu.getJoueurPion(col,line) == 2){%>
                            <input type="submit" value="" name="A1" class="bouton_puissanceJaune">
                        <% }else{%>
                            <input type="submit" value="" name="A1" class="bouton_puissance">
                        <%}%>
                    </td>
                </form>
                <%}
            }
            if(jeu.statut() == "finie"){
            %>
            <form method="get" action="jeu.jsp">
                <input type="submit" value="RESET" name="B2" class="buttonTest">
            </form>
            <%
            }%>
            </tr>
        </table>
    </body>
</html>

