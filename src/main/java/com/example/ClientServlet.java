package com.example;
import java.io.*;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "servletclient", value = "/servlet-client")
public class ClientServlet extends HttpServlet 
{
    private String message;
    private ArrayList<Client> clients;

    public void init() {
        clients = new ArrayList<Client>();
        System.out.println("Le serveur passe bien par init");
    }

    public void service(HttpServletRequest request, HttpServletResponse reponse) throws IOException, ServletException {
        System.out.println("le serveur passe bien par le service");
        doPost(request, reponse);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
    {
        String nom = request.getParameter("nom");
        String city = request.getParameter("city");
        String adr = request.getParameter("adr");
        
        request.setAttribute("nom", nom);
        request.setAttribute("city", city);
        request.setAttribute("adr", adr);
        request.setAttribute("clients", clients);

        RequestDispatcher disp = request.getRequestDispatcher("client.jsp");
        try
        {
            disp.forward(request, response);
        }
        catch (ServletException e)
        {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

    public void destroy() {
        System.out.println("le serveur passe bien par le  destroy");
    }
}