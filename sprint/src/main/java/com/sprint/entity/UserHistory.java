package com.sprint.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
@Entity
public class UserHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer historyId;

    private Date date;

    private float price;

    private String pickUpLoc;

    private String dropLoc;

    private int rating;

    private String feedback;


    public UserHistory(){

    }

    public UserHistory(Date date, float price, String pickUpLoc, String dropLoc, int rating,String feedback) {
        this.date = date;
        this.price = price;
        this.pickUpLoc = pickUpLoc;
        this.dropLoc = dropLoc;
        this.rating = rating;
        this.feedback=feedback;
    }

    public Number getHistoryId() {
        return historyId;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPickUpLoc() {
        return pickUpLoc;
    }

    public void setPickUpLoc(String pickUpLoc) {
        this.pickUpLoc = pickUpLoc;
    }

    public String getDropLoc() {
        return dropLoc;
    }

    public void setDropLoc(String dropLoc) {
        this.dropLoc = dropLoc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
