<html>
    <%@ include file="head.jsp" %>
    <body>
        <%@ include file="head.jsp" %>
        <%@ include file="navigation.jsp" %>
        <h2>Damier en JEE</h2>
        <table>
            <tbody>
            <% 
                int line = Integer.parseInt((String) request.getAttribute("lin"));
                int col = Integer.parseInt((String) request.getAttribute("col"));
                String[] colors = {"black", "white"};

                for (int i = 0; i < col; i++)
                {
                    %>
                    <tr>
                    <%
                    for (int j = 0; j < line; j++)
                    {
                        String color = colors[(j+i)%2];
                        %> 
                        <td class="<%= color %>"></td>
                        <%
                    }
                    %>
                    </tr>
                    <%
                }
            %>
            </tbody>
        </table>
        <%@ include file="footer.jsp" %>
    </body>
</html>