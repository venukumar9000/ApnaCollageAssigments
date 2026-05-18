package org.example.interviewpreparationlatest.interfacejava8;

public class Paytm implements Payment{
    @Override
    public void doTrasaction() {
        System.out.println("pay with paytm");
    }

    @Override
    public void addCoupan() {
        System.out.println("add 10% discount on paytm");;
    }
}
