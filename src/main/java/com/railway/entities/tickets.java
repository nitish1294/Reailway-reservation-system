/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.railway.entities;

/**
 *
 * @author Nitish
 */
public class tickets {
    
    
    private String userid;
    private String trainno;
    private String trainname;
    private String bookedfrom;
    private String bookedto;
    private String traindate;
    private String fire;
    private String pname;
    private String age;
    private String pgender;
    private String phoneno;
    private String pemail;

    @Override
    public String toString() {
        return "tickets{" + "userid=" + userid + ", trainno=" + trainno + ", trainname=" + trainname + ", bookedfrom=" + bookedfrom + ", bookedto=" + bookedto + ", traindate=" + traindate + ", fire=" + fire + ", pname=" + pname + ", age=" + age + ", pgender=" + pgender + ", phoneno=" + phoneno + ", pemail=" + pemail + '}';
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTrainno() {
        return trainno;
    }

    public void setTrainno(String trainno) {
        this.trainno = trainno;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public String getBookedfrom() {
        return bookedfrom;
    }

    public void setBookedfrom(String bookedfrom) {
        this.bookedfrom = bookedfrom;
    }

    public String getBookedto() {
        return bookedto;
    }

    public void setBookedto(String bookedto) {
        this.bookedto = bookedto;
    }

    public String getTraindate() {
        return traindate;
    }

    public void setTraindate(String traindate) {
        this.traindate = traindate;
    }

    public String getFire() {
        return fire;
    }

    public void setFire(String fire) {
        this.fire = fire;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPgender() {
        return pgender;
    }

    public void setPgender(String pgender) {
        this.pgender = pgender;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getPemail() {
        return pemail;
    }

    public void setPemail(String pemail) {
        this.pemail = pemail;
    }

    public tickets() {
    }

    public tickets(String userid, String trainno, String trainname, String bookedfrom, String bookedto, String traindate, String fire, String pname, String age, String pgender, String phoneno, String pemail) {
        this.userid = userid;
        this.trainno = trainno;
        this.trainname = trainname;
        this.bookedfrom = bookedfrom;
        this.bookedto = bookedto;
        this.traindate = traindate;
        this.fire = fire;
        this.pname = pname;
        this.age = age;
        this.pgender = pgender;
        this.phoneno = phoneno;
        this.pemail = pemail;
    }
    
    
}
