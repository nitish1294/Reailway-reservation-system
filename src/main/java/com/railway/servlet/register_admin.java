/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.railway.servlet;

import com.railway.entities.admin;
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
public class register_admin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phoneno");
        String password = request.getParameter("password");

        admin admin = new admin();
        admin.setFullname(name);
        admin.setMailid(email);
        admin.setPhoneno(phone);
        admin.setPassword(password);

        HttpSession session = request.getSession();
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "123456");
            PreparedStatement stmt = con.prepareStatement("insert into admin(admin_name,mail_id,phone_no,password) values(?,?,?,?)");
            stmt.setString(1, admin.getFullname());
            stmt.setString(2, admin.getMailid());
            stmt.setString(3, admin.getPhoneno());
            stmt.setString(4, admin.getPassword());
            int i = stmt.executeUpdate();
            if(i==1){
                
                session.setAttribute("welcome","Admin Created");
                session.setAttribute("admin",name);
                response.sendRedirect("admin_home.jsp");
            }
            else{
                session.setAttribute("error","please try again letter");
                response.sendRedirect("admin");
            }
            
            
            
        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            
        }

    }
}
