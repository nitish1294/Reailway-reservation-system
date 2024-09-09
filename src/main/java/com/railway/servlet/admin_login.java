/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.railway.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nitish
 */
public class admin_login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userid = request.getParameter("email");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();
        Connection con = null;
        PrintWriter out = response.getWriter();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "123456");
            PreparedStatement stmt = con.prepareStatement("select * from admin where mail_id = ? and password = ?");
            stmt.setString(1, userid);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {

                session.setAttribute("admin", rs.getString("admin_name"));
                session.setAttribute("welcome", "you are successfully login");
                response.sendRedirect("admin_home.jsp");

            } else {
                out.println("wrong userid and password");
                RequestDispatcher rd = request.getRequestDispatcher("admin.html");
                rd.include(request, response);
                response.sendRedirect("admin.html");

            }
        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            response.sendRedirect("admin.html");
        }

    }
}
