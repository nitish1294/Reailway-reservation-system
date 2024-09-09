/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.railway.entities;

/**
 *
 * @author Nitish
 */
public class search {

    private String traincode;
    private String trainname;
    private String trainfrom;
    private String trainto;
    private String traindate;
    private String traintime;
    private String trainfire;

    @Override
    public String toString() {
        return "search{" + "traincode=" + traincode + ", trainname=" + trainname + ", trainfrom=" + trainfrom + ", trainto=" + trainto + ", traindate=" + traindate + ", traintime=" + traintime + ", trainfire=" + trainfire + '}';
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

    public String getTrainfire() {
        return trainfire;
    }

    public void setTrainfire(String trainfire) {
        this.trainfire = trainfire;
    }

    public search(String traincode, String trainname, String trainfrom, String trainto, String traindate, String traintime, String trainfire) {
        this.traincode = traincode;
        this.trainname = trainname;
        this.trainfrom = trainfrom;
        this.trainto = trainto;
        this.traindate = traindate;
        this.traintime = traintime;
        this.trainfire = trainfire;
    }

    public search() {
    }
}
