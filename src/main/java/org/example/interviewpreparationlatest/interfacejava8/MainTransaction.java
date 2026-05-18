package org.example.interviewpreparationlatest.interfacejava8;

public class MainTransaction {
    public static void main(String[] args) {
        Payment payment = new GooglePay();
        Payment paytm = new Paytm();
        payment.doTrasaction();
        paytm.doTrasaction();
        payment.addCoupan();
        paytm.addCoupan();
        Payment.generateBill();
    }
}
