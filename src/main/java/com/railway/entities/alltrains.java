/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.railway.entities;

public class alltrains {

    private String traincode;
    private String trainname;
    private String trainfrom;
    private String trainto;
    private String traindate;
    private String traintime;
    private String tfire;

    @Override
    public String toString() {
        return "alltrains{" + "traincode=" + traincode + ", trainname=" + trainname + ", trainfrom=" + trainfrom + ", trainto=" + trainto + ", traindate=" + traindate + ", traintime=" + traintime + ", tfire=" + tfire + '}';
    }

    public String getTraincode() {
        return traincode;
    }

    public void setTraincode(String traincode) {
        this.traincode = traincode;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public String getTrainfrom() {
        return trainfrom;
    }

    public void setTrainfrom(String trainfrom) {
        this.trainfrom = trainfrom;
    }

    public String getTrainto() {
        return trainto;
    }

    public void setTrainto(String trainto) {
        this.trainto = trainto;
    }

    public String getTraindate() {
        return traindate;
    }

    public void setTraindate(String traindate) {
        this.traindate = traindate;
    }

    public String getTraintime() {
        return traintime;
    }

    public void setTraintime(String traintime) {
        this.traintime = traintime;
    }

    public String getTfire() {
        return tfire;
    }

    public void setTfire(String tfire) {
        this.tfire = tfire;
    }

    public alltrains(String traincode, String trainname, String trainfrom, String trainto, String traindate, String traintime, String tfire) {
        this.traincode = traincode;
        this.trainname = trainname;
        this.trainfrom = trainfrom;
        this.trainto = trainto;
        this.traindate = traindate;
        this.traintime = traintime;
        this.tfire = tfire;
    }

    public alltrains() {
    }
}
