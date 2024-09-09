/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.railway.servlet;

import com.railway.entities.customer;
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
public class cregister extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String email = req.getParameter("email");
        String phone = req.getParameter("phoneno");
        String password = req.getParameter("password");
        String address = req.getParameter("address");
        
        customer user=new customer();
        user.setMailid(email);
        user.setFname(fname);
        user.setLname(lname);
        user.setAddress(address);
        user.setPhoneno(phone);
        user.setPassword(password);
        
        
        HttpSession session=req.getSession();
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "123456");
            PreparedStatement stmt = con.prepareStatement("insert into customer values(?,?,?,?,?,?)");
            stmt.setString(1, user.getMailid());
            stmt.setString(2, user.getFname());
            stmt.setString(3, user.getLname());
            stmt.setString(4, user.getAddress());
            stmt.setString(5, user.getPhoneno());
            stmt.setString(6, user.getPassword());
            
            
            int i = stmt.executeUpdate();
            if(i==1){
                
                session.setAttribute("welcome","you are successfully register");
                session.setAttribute("user",fname);
                resp.sendRedirect("index.jsp");

            }

            
            
        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            resp.sendRedirect("register.html");
        }

    }

}
