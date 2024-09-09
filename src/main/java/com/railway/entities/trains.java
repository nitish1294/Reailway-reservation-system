/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.railway.entities;

/**
 *
 * @author Nitish
 */
public class trains {

    private String trainno;
    private String traincode;
    private String trainname;
    private String distance;
    private String releaseby;
    private String traindate;
    private String trainarrival;
    private String traindestination;
    private String arrivaltime;
    private String tfire;

    @Override
    public String toString() {
        return "trains{" + "trainno=" + trainno + ", traincode=" + traincode + ", trainname=" + trainname + ", distance=" + distance + ", releaseby=" + releaseby + ", traindate=" + traindate + ", trainarrival=" + trainarrival + ", traindestination=" + traindestination + ", arrivaltime=" + arrivaltime + ", tfire=" + tfire + '}';
    }

    public String getTrainno() {
        return trainno;
    }

    public void setTrainno(String trainno) {
        this.trainno = trainno;
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

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getReleaseby() {
        return releaseby;
    }

    public void setReleaseby(String releaseby) {
        this.releaseby = releaseby;
    }

    public String getTraindate() {
        return traindate;
    }

    public void setTraindate(String traindate) {
        this.traindate = traindate;
    }

    public String getTrainarrival() {
        return trainarrival;
    }

    public void setTrainarrival(String trainarrival) {
        this.trainarrival = trainarrival;
    }

    public String getTraindestination() {
        return traindestination;
    }

    public void setTraindestination(String traindestination) {
        this.traindestination = traindestination;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getTfire() {
        return tfire;
    }

    public void setTfire(String tfire) {
        this.tfire = tfire;
    }

    public trains(String traincode, String trainname, String distance, String releaseby, String traindate, String trainarrival, String traindestination, String arrivaltime, String tfire) {
        this.traincode = traincode;
        this.trainname = trainname;
        this.distance = distance;
        this.releaseby = releaseby;
        this.traindate = traindate;
        this.trainarrival = trainarrival;
        this.traindestination = traindestination;
        this.arrivaltime = arrivaltime;
        this.tfire = tfire;
    }

    public trains(String trainno, String traincode, String trainname, String distance, String releaseby, String traindate, String trainarrival, String traindestination, String arrivaltime, String tfire) {
        this.trainno = trainno;
        this.traincode = traincode;
        this.trainname = trainname;
        this.distance = distance;
        this.releaseby = releaseby;
        this.traindate = traindate;
        this.trainarrival = trainarrival;
        this.traindestination = traindestination;
        this.arrivaltime = arrivaltime;
        this.tfire = tfire;
    }

    public trains() {
    }

}
