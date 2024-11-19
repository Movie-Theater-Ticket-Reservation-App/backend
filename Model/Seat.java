package com.acmeplex.movieticketreservation.Model;

import jakarta.persistence.*;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seatID;
    private int seatNumber;
    private String seatRow;
    private String status;

    @ManyToOne
    @JoinColumn(name = "showtimeID")
    private Showtime showtime;

    public Seat(int seatNumber, String seatRow, String status, Showtime showtime) {
        this.seatNumber = seatNumber;
        this.seatRow = seatRow;
        this.status = status;
        this.showtime = showtime;
    }

    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(String seatRow) {
        this.seatRow = seatRow;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    public void updateSeat(){
        System.out.println("seat is updated!!");
    }
}
