package com.acmeplex.movieticketreservation.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class RegisteredUser extends User{
    private String name;
    private Float membershipFee = 100.0f;
    private int creditPoints;
    private String address;
    private String password;
    @OneToMany(mappedBy = "registeredUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> ticketHistory;
    //private List<Payment> paymentHistory;


    public void payMembershipFee() {
        System.out.println("Membership fee paid: $" + membershipFee);
    }
    public void applyDiscount() {
        System.out.println("Discount applied for Registered User: " + name);
    }
    public void logIn(){
        System.out.println("user is logged in");
    }
//    public void registerUser(String name, String email, String address) {
//        this.name = name;
//        this.setEmail(email);
//        this.address = address;
//        this.membershipFee = 20.0f;
//        this.creditPoints = 0;
//        System.out.println("Registering user: " + name);
//        System.out.println("Email: " + email);
//        System.out.println("Address: " + address);
//        System.out.println("Membership Fee: $" + membershipFee);
//        System.out.println("Credit Points: " + creditPoints);
//        System.out.println("User successfully registered!");
//    }
}
