<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Booking Result</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h2>Booking Result</h2>

    <%
        String username = (String) session.getAttribute("username");
        Integer age = (Integer) session.getAttribute("age");
        String movieName = (String) request.getAttribute("movieName");
        Boolean isAdult = (Boolean) request.getAttribute("isAdult");
    %>

    <%
        if (isAdult != null && isAdult && age < 18) {
    %>
        <p>Sorry, <b><%= username %></b>!</p>
        <p>You are under 18 and cannot book the adult movie: 
           <b><%= movieName %></b>.</p>
    <%
        } else {
    %>
        <p>Congratulations, <b><%= username %></b>!</p>
        <p>Your booking for <b><%= movieName %></b> is confirmed.</p>
    <%
        }
    %>

    <br>
    <a href="movies.html">Back to Movies</a>
</body>
</html>
