/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.railway.servlet;

import com.railway.entities.trains;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sun.font.TrueTypeFont;

/**
 *
 * @author Nitish
 */
public class addtrain extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String traincode = request.getParameter("tcode");
        String trainname = request.getParameter("tname");
        String distance = request.getParameter("tdistance");
        String releaseby = request.getParameter("bookedby");
        String tdate = request.getParameter("tdate");
        String trainfrom = request.getParameter("tfrom");
        String trainto = request.getParameter("tto");
        String atime = request.getParameter("atime");
        String fire=request.getParameter("fire");

        trains train = new trains();
        train.setTraincode(traincode);
        train.setTrainname(trainname);
        train.setDistance(distance);
        train.setReleaseby(releaseby);
        train.setTraindate(tdate);
        train.setTrainarrival(trainfrom);
        train.setTraindestination(trainto);
        train.setArrivaltime(atime);
        train.setTfire(fire);
        
        
        HttpSession session = request.getSession();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "123456");
            PreparedStatement stmt = con.prepareStatement("insert into addtrain(train_code,train_name,distance,release_by,train_date,train_arrival,train_to,arrival_time,fire) values(?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, train.getTraincode());
            stmt.setString(2, train.getTrainname());
            stmt.setString(3, train.getDistance());
            stmt.setString(4, train.getReleaseby());
            stmt.setString(5, train.getTraindate());
            stmt.setString(6, train.getTrainarrival());
            stmt.setString(7, train.getTraindestination());
            stmt.setString(8, train.getArrivaltime());
            stmt.setString(9, train.getTfire());

            int i = stmt.executeUpdate();
            if (i == 1) {

                session.setAttribute("welcome", "Admin Created");
                response.sendRedirect("admin_home.jsp");
            } else {
                session.setAttribute("error", "please try again letter");
                response.sendRedirect("error.jsp");
            }

        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
