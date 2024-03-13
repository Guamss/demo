<html>
    <body>
        <%@ page import="java.util.ArrayList" %>
        <%@ page import="com.example.Client" %>
        <%@ include file="head.jsp" %>
        <%@ include file="navigation.jsp" %>
        <%@ include file="formulaire_client.jsp" %>
        <% 
            String nom = String.valueOf(request.getAttribute("nom")); 
            String city = String.valueOf(request.getAttribute("city")); 
            String adr = String.valueOf(request.getAttribute("adr"));
            ArrayList<Client> clients = (ArrayList<Client>) request.getAttribute("clients"); 
            
            if (nom != null && city != null && adr != null)
            {
                clients.add(new Client(nom, city, adr));
            }
        %>gcat 
        <p><%= city %></p>
        <%
        for (Client client : clients)
        {
        %>
        <ul>
            <li>Nom : <%= client.getNom() %></li>
            <li>Ville : <%= client.getCity() %></li>
            <li>Adresse : <%= client.getAdr() %></li>
        </ul>
        <%
        }
        %>
    </body>
    <%@ include file="footer.jsp" %>
</html>