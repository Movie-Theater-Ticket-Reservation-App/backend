package com.acmeplex.movieticketreservation.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketID;

    private int seatNumber;
    private int showtimeID;
    private int userID;

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getShowtimeID() {
        return showtimeID;
    }

    public void setShowtimeID(int showtimeID) {
        this.showtimeID = showtimeID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Ticket(int seatNumber, int showtimeID, int userID) {
        this.seatNumber = seatNumber;
        this.showtimeID = showtimeID;
        this.userID = userID;
    }

    public void cancelTicket(){
        System.out.println("ticket is cancelled!");
    }
}
