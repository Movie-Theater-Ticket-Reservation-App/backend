package com.acmeplex.movieticketreservation.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Showtime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int showtimeID;

    private String time;
    private String date;
    private int theatreID;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "showtime")
    private List<Seat> seats;

    public Showtime(String time, String date, int theatreID, List<Seat> seats) {
        this.time = time;
        this.date = date;
        this.theatreID = theatreID;
        this.seats = seats;
    }

    public int getShowtimeID() {
        return showtimeID;
    }

    public void setShowtimeID(int showtimeID) {
        this.showtimeID = showtimeID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTheatreID() {
        return theatreID;
    }

    public void setTheatreID(int theatreID) {
        this.theatreID = theatreID;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
