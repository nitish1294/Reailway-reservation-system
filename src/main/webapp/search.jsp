<%-- 
    Document   : search
    Created on : Apr 14, 2024, 6:48:10 PM
    Author     : Nitish
--%>
<%@page import="com.railway.entities.search"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8" />
        <title>search-trains</title>
        <style>
            * {
                margin: 0;
                padding: 0;
                outline: none;
                border: none;
                text-decoration: none;
                box-sizing: border-box;
                font-family: "Poppins", sans-serif;
            }

            body {
                background: rgb(226, 226, 226);
            }

            .container {
                display: flex;
            }

            /* MAin Section */
            .main {
                position: relative;
                padding: 20px;
                width: 100%;
            }

            /*search List serction  */
            .search {
                margin-top: 20px;
                text-transform: capitalize;
            }

            .search-list {
                width: 100%;
                padding: 10px;
                margin-top: 10px;
                background: #fff;
                border-radius: 10px;
                box-shadow: 0 20px 35px rgba(0, 0, 0, 0.1);
            }

            .table {
                border-collapse: collapse;
                margin: 25px 0;
                font-size: 15px;
                min-width: 100%;
                overflow: hidden;
                border-radius: 5px 5px 0 0;
            }

            table thead tr {
                color: #fff;
                background: #5c9dff;
                text-align: left;
                font-weight: bold;
            }

            .table th,
            .table td {
                padding: 12px 15px;
            }

            .table tbody tr {
                border-bottom: 1px solid #ddd;
            }

            .table tbody tr:nth-of-type(odd) {
                background: #f3f3f3;
            }

            .table tbody tr.active {
                font-weight: bold;
                color: #4AD489;
            }

            .table tbody tr:last-of-type {
                border-bottom: 2px solid #4AD489;
            }

            .table .button {
                padding: 6px 20px;
                border-radius: 10px;
                cursor: pointer;
                background: transparent;
                border: 1px solid #4AD489;
            }

            .table .button:hover {
                background: #4AD489;
                color: #fff;
                transition: 0.5rem;
            }
        </style>

    </head>

    <body>
        <div class="container">
            <section class="main">
                <section class="search">
                    <div class="search-list">
                        <h1>Train List</h1>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Train No.</th>
                                    <th>Train Name</th>
                                    <th>From</th>
                                    <th>To</th>
                                    <th>Date</th>
                                    <th>Time</th>
                                    <th>Fire</th>
                                    <th>Book Now</th>
                                </tr>
                            </thead>
                            <%
                                List<search> trains = (List<search>) session.getAttribute("searchdata");
                                for (search s : trains) {

                            %>
                            <tbody>

                            <td><%= s.getTraincode()%></td>
                            <td><%= s.getTrainname()%></td>
                            <td><%= s.getTrainfrom()%></td>
                            <td><%= s.getTrainto()%></td>
                            <td><%= s.getTraindate()%></td>
                            <td><%= s.getTraintime()%></td>
                            <td><%= s.getTrainfire()%></td>
                            <form action="book_ticket.jsp" >
                                <input type="hidden"  name="user" value="<%=session.getAttribute("user")%>"> 
                                <input type="hidden"  name="traincode" value="<%=s.getTraincode()%>">
                                <input type="hidden"  name="trainname" value="<%=s.getTrainname()%>">
                                <input type="hidden"  name="trainfrom" value="<%=s.getTrainfrom()%>">
                                <input type="hidden"  name="trainto" value="<%= s.getTrainto()%>">
                                <input type="hidden"  name="Date" value="<%=s.getTraindate()%>">
                                <input type="hidden"  name="price" value="<%=s.getTrainfire()%>">
                                <td><input class="button" type="submit" value="Book "></td>
                            </form>
                            </tbody>
                            <% }%>
                        </table>
                    </div>
                </section>
            </section>
        </div>

    </body>

</html>