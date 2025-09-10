package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException {
	    // Redirect to register.html when accessed via GET
	    resp.sendRedirect("register.html");
	}


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {

            String email = req.getParameter("email");
            int age = Integer.parseInt(req.getParameter("age"));
            String password = req.getParameter("password");


            User user = new User(email, age, password);

            HttpSession session = req.getSession();
            session.setAttribute("user", user);

            resp.sendRedirect("login.html");

        } catch (NumberFormatException e) {
            resp.getWriter().println("Invalid age entered!");
        }
    }
}
