package org.example.interviewpreparationlatest.interfacejava8;

public interface Payment {
    void doTrasaction();

    public default void addCoupan(){
        System.out.println(" add 5% discount");
    }
    static void generateBill(){
        System.out.println("generate bill on each transaction");
    }
}
