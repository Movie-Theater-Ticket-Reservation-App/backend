package com.acmeplex.movieticketreservation.Model;

import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class RegisteredUser extends User{
    private String name;
    private Float membershipFee;
    private int creditPoints;
    private String address;
    private List<Ticket> ticketHistory;
    // private List<Payment> paymentHistory;

    public void payMembershipFee() {
        System.out.println("Membership fee paid: $" + membershipFee);
    }
    public void applyDiscount() {
        System.out.println("Discount applied for Registered User: " + name);
    }
    public void logIn(){
        System.out.println("user is logged in");
    }
}
