/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.railway.servlet;

import com.railway.entities.tickets;
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

/**
 *
 * @author Nitish
 */
public class booknow extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String userid = request.getParameter("bookedby");
        String tno = request.getParameter("tnumber");
        String tname = request.getParameter("tname");
        String bookfrom = request.getParameter("tfrom");
        String bookto = request.getParameter("tto");
        String tdate = request.getParameter("tdate");
        String fire = request.getParameter("tprice");
        String pname = request.getParameter("pname");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        tickets ticket = new tickets();
        ticket.setUserid(userid);
        ticket.setTrainno(tno);
        ticket.setTrainname(tname);
        ticket.setBookedfrom(bookfrom);
        ticket.setBookedto(bookto);
        ticket.setTraindate(tdate);
        ticket.setFire(fire);
        ticket.setPname(pname);
        ticket.setAge(age);
        ticket.setPgender(gender);
        ticket.setPhoneno(phone);
        ticket.setPemail(email);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "123456");
            PreparedStatement stmt = con.prepareStatement("insert into tickets(booked_by,train_number,train_name,booked_from,booked_to,train_date,fire,pname,passenger_age,p_gender,p_phoneno,p_emailid)  values(?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, ticket.getUserid());
            stmt.setString(2, ticket.getTrainno());
            stmt.setString(3, ticket.getTrainname());
            stmt.setString(4, ticket.getBookedfrom());
            stmt.setString(5, ticket.getBookedto());
            stmt.setString(6, ticket.getTraindate());
            stmt.setString(7, ticket.getFire());
            stmt.setString(8, ticket.getPname());
            stmt.setString(9, ticket.getAge());
            stmt.setString(10, ticket.getPgender());
            stmt.setString(11, ticket.getPhoneno());
            stmt.setString(12, ticket.getPemail());
            int i = stmt.executeUpdate();
            if (i == 1) {

                session.setAttribute("welcome", "Admin Created");
                response.sendRedirect("index.jsp");

            }

        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            response.sendRedirect("error.jsp");
        }

    }
}
