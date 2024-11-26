package com.acmeplex.movieticketreservation.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketID;

    private int seatNumber;
    private int showtimeID;

    @ManyToOne
    @JoinColumn(name = "registered_user_id", referencedColumnName = "userID")
    private RegisteredUser registeredUser;

    private int userID;

    public Ticket(int seatNumber, int showtimeID, int userID) {
        this.seatNumber = seatNumber;
        this.showtimeID = showtimeID;
        this.userID = userID;
    }

    public Ticket() {
    }

    public void cancelTicket(){
        System.out.println("ticket is cancelled!");
    }
}
