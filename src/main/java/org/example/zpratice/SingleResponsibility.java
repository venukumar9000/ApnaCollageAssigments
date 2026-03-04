package org.example.zpratice;

import org.example.solidprinciples.Invoice;

public class SingleResponsibility {
    public static void main(String[] args) {
        Invoices invoices =new Invoices("mobile",222.22);
        PrintInvoice printInvoice= new PrintInvoice();
        printInvoice.printInvoice(invoices);
        SaveToDb saveToDb =new SaveToDb();
        saveToDb.save(invoices);
    }
}
class Invoices {
    String details;
    double amount;

    Invoices(String details,double amount){
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
class PrintInvoice{
    void printInvoice (Invoices invoices){
        System.out.println("printing Details :"+invoices.getDetails()+"total amount :"+invoices.getAmount());
    }
}
class SaveToDb{
    void save(Invoices invoices){
        System.out.println("saving to db");
    }
}
