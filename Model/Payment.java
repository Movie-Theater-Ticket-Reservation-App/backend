package com.acmeplex.movieticketreservation.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentID;

    private String paymentType;
    private Double amount;

    public Payment(String paymentType, Double amount) {
        this.paymentType = paymentType;
        this.amount = amount;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void makePayment(){
        System.out.println("payment is made...");
    }
    public void refund(){
        System.out.println("refund is proccessed...");
    }
}
