package com.sprint.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserLocation {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String pickUpLoc;

    private String dropLoc;

    public UserLocation(){

    }

    public UserLocation(String pickUpLoc, String dropLoc) {
        this.pickUpLoc = pickUpLoc;
        this.dropLoc = dropLoc;
    }

    public Number getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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
}
