package org.example.designpatterns;


class LegacyPayment{
    public void makePayment(int amount){
        System.out.println("paid using legacypayment "+amount);
    }

}
interface Payment{
    void pay(double amount);
}
class ModernPayment implements Payment{

    private LegacyPayment legacyPayment;

    public ModernPayment(LegacyPayment legacyPayment){
        this.legacyPayment=legacyPayment;
    }
    public void pay(double amount){
      legacyPayment.makePayment((int)amount);
    }
}
public class AdopterDesignPattern {
    public static void main(String[] args) {
        LegacyPayment legacyPayment = new LegacyPayment();
        Payment payment= new ModernPayment(legacyPayment);
        payment.pay(250.00);
    }




}

