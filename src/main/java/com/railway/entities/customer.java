/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.railway.entities;

/**
 *
 * @author Nitish
 */
public class customer {
    private  String fname;
    private  String lname;
    private  String mailid;
    private  String address;
    private  String phoneno;
    private  String password;

    @Override
    public String toString() {
        return "customer{" + "fname=" + fname + ", lname=" + lname + ", mailid=" + mailid + ", address=" + address + ", phoneno=" + phoneno + ", password=" + password + '}';
    }

    public customer(String fname, String lname, String mailid, String address, String phoneno, String password) {
        this.fname = fname;
        this.lname = lname;
        this.mailid = mailid;
        this.address = address;
        this.phoneno = phoneno;
        this.password = password;
    }

    public customer() {
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    
    
}
