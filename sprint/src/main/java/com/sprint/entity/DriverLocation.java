package com.sprint.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class DriverLocation {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String liveLoc;

    public DriverLocation(){

    }
    public DriverLocation(String liveLoc) {
        this.liveLoc = liveLoc;
    }

    public Number getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getLiveLoc() {
        return liveLoc;
    }

    public void setLiveLoc(String liveLoc) {
        this.liveLoc = liveLoc;
    }
}
