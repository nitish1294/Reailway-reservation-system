/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.railway.servlet;

import com.railway.entities.search;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class alltrain extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String date = request.getParameter("date");

        HttpSession session = request.getSession();
        List< search> train = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "123456");
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM addtrain WHERE train_arrival=? and train_to=? and train_date=?");
            stmt.setString(1, from);
            stmt.setString(2, to);
            stmt.setString(3, date);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String tcode = rs.getString("train_code");
                String tname = rs.getString("train_name");
                String tfrom = rs.getString("train_arrival");
                String tto = rs.getString("train_to");
                String tdate = rs.getString("train_date");
                String ttime = rs.getString("arrival_time");
                String tfire = rs.getString("fire");
                train.add(new search(tcode, tname, tfrom, tto, tdate, ttime, tfire));
            }
            request.getSession().setAttribute("searchdata", train);
            response.sendRedirect("search.jsp");
        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            response.sendRedirect("error.jsp");
        }

    }
}
