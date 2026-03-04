package org.example.solidprinciples;

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("mobile phone",2222.33);
        new PrintInvoice().print(invoice);
        new SaveToDb().save(invoice);
    }
}