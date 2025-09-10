package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BookingServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException {
	    resp.sendRedirect("booking.html"); // or show a message
	}

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");

        String movie = req.getParameter("movie");
        String isAdult = req.getParameter("isAdult");

        if (isAdult.equals("true") && user.getAge() < 18) {
            resp.getWriter().println("❌ Sorry, you must be 18+ to book this movie: " + movie);
        } else {
            resp.getWriter().println("✅ Booking Successful for: " + movie);
        }
    }
}
