package com.sprint.entity;


import jakarta.persistence.*;

@Entity
public class DriverHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer driverHistoryID;

    private String destinationLoc;

    private String pickUpLoc;

    private int rate;

    private String feedback;

    public DriverHistory(){

    }

    public DriverHistory(String destinationLoc, String pickUpLoc, int rate, String feedback) {
        this.destinationLoc = destinationLoc;
        this.pickUpLoc = pickUpLoc;
        this.rate = rate;
        this.feedback = feedback;
    }

    public Integer getDriverHistoryID() {
        return driverHistoryID;
    }

    public void setDriverHistoryID(Integer driverHistoryID) {
        this.driverHistoryID = driverHistoryID;
    }

    public String getDestinationLoc() {
        return destinationLoc;
    }

    public void setDestinationLoc(String destinationLoc) {
        this.destinationLoc = destinationLoc;
    }

    public String getPickUpLoc() {
        return pickUpLoc;
    }

    public void setPickUpLoc(String pickUpLoc) {
        this.pickUpLoc = pickUpLoc;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
