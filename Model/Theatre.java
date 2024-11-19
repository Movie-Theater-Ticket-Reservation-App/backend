package com.acmeplex.movieticketreservation.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int theatreID;

    private String theatreName;
    private String theatreLocation;
    private int capacity;

    public Theatre(String theatreName, String theatreLocation, int capacity) {
        this.theatreName = theatreName;
        this.theatreLocation = theatreLocation;
        this.capacity = capacity;
    }

    public int getTheatreID() {
        return theatreID;
    }

    public void setTheatreID(int theatreID) {
        this.theatreID = theatreID;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getTheatreLocation() {
        return theatreLocation;
    }

    public void setTheatreLocation(String theatreLocation) {
        this.theatreLocation = theatreLocation;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void getShowtimes(){
        System.out.println("showtimes generated!!");
    }
}
