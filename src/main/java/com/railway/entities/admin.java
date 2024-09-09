package com.railway.entities;

/**
 *
 * @author Nitish
 */
public class admin {
    private int adminid;
    private String mailid;
    private String fullname;
    private String phoneno;
    private String password;

    public admin() {
    }

    public admin(String mailid, String fullname, String phoneno, String password) {
        this.mailid = mailid;
        this.fullname = fullname;
        this.phoneno = phoneno;
        this.password = password;
    }

    @Override
    public String toString() {
        return "admin{" + "mailid=" + mailid + ", fullname=" + fullname + ", phoneno=" + phoneno + ", password=" + password + '}';
    }

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public admin(int adminid, String mailid, String fullname, String phoneno, String password) {
        this.adminid = adminid;
        this.mailid = mailid;
        this.fullname = fullname;
        this.phoneno = phoneno;
        this.password = password;
    }

}
