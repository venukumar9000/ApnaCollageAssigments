package org.example.solidprinciples;

public class Invoice {
    String details;
    double amount;

    Invoice(String details,double amount){
        this.details=details;
        this.amount=amount;
    }
    public String getDetails(){
        return details;
    }
    public double getAmount(){
        return amount;
    }
}
