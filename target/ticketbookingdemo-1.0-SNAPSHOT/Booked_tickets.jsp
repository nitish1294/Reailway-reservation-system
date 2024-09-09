<%-- 
    Document   : Booked_tickets
    Created on : Apr 16, 2024, 3:31:18 PM
    Author     : Nitish
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page errorPage="error.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8" />
        <title>All-Tickets</title>
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
                        <h1>Tickets Booked</h1>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>PNR-No.</th>
                                    <th>Booked-by</th>
                                    <th>Arrivale</th>
                                    <th>Train-no.</th>
                                    <th>Train-date</th>
                                    <th>P_name</th>
                                    <th>P_age</th>
                                    <th>P_gender</th>
                                    <th>P_phone</th>
                                    <th>P_email</th>
                                    <th>Delete</th>
                                </tr>
                            </thead>
                            <%
                                try {
                                    Class.forName("com.mysql.cj.jdbc.Driver");

                                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "123456");

// Create a statement to execute the query
                                    Statement stmt = conn.createStatement();

// Execute the query and get the results
                                    ResultSet rs = stmt.executeQuery("SELECT * FROM tickets ");

// Iterate over the results and display them on the page
                                    while (rs.next()) {


                            %>
                            <tbody>
                                <tr>
                                    <td><%= rs.getInt("PNR_no")%></td>
                                    <td><%= rs.getString("booked_by")%></td>
                                    <td><%= rs.getString("booked_from")%></td>
                                    <td><%= rs.getString("train_number")%></td>
                                    <td><%= rs.getString("train_date")%></td>
                                    <td><%= rs.getString("pname")%></td>
                                    <td><%= rs.getString("passenger_age")%></td>
                                    <td><%= rs.getString("p_gender")%></td>
                                    <td><%= rs.getString("p_phoneno")%></td>
                                    <td><%= rs.getString("p_emailid")%></td>
                            <form action="#" method="get">
                                <td><input class="button" type="submit" value="Delete"></td>
                            </form>
                            </tr>
                            </tbody>
                            <% }
                                } catch (Exception e) {
                                }%>
                        </table>
                    </div>
                </section>
            </section>
        </div>

    </body>

</html>