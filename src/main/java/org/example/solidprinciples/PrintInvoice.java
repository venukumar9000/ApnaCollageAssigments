package org.example.solidprinciples;

public class PrintInvoice {
    public void print(Invoice invoice){
        System.out.println("Invoice :"+invoice.getDetails()+" total amount :"+invoice.getAmount());
    }
}
