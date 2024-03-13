package com.example;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "servletlogin", value = "/servlet-login")
public class LoginServlet extends HttpServlet
{
    private String message;
    private ArrayList<Client> clients;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RequestDispatcher disp = request.getRequestDispatcher("login_form.jsp");
        try
        {
            disp.forward(request, response);
        }
        catch (ServletException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
    {
        String login = request.getParameter("login");
        String password = request.getParameter("pwd");
        if (login.equals("admin") && password.equals("admin"))
        {
            HttpSession session = request.getSession();
            RequestDispatcher disp = request.getRequestDispatcher("accueil.jsp");
            try
            {
                disp.forward(request, response);
            }
            catch (ServletException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
    
}
