package org.example.latest_interview_preparation.solid_principles;

class Bank{
    public void loanProcess(String type){
        if(type.equals("home")){
            System.out.println("home loan processing");
        }
        if(type.equals("car")){
            System.out.println("car loan processing");
        }

    }
    public void sendOtp(String type){
        if(type.equals("email")){
            System.out.println(" sending otp through mail");
        }
    }
}
public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.loanProcess("home");
        bank.sendOtp("email");

        BankService service = new BankService();
        service.handleOperations();
    }
}
class BankService{
    LoanService loanService= new LoanService();
    NotificationService service = new NotificationService();

    public void handleOperations(){
       loanService.loanProcess("home");
       service.sendOtp("SMS");
    }

}
class NotificationService{
    public void sendOtp(String type){
        if(type.equals("email")){
            System.out.println("otp through email");
        }
        if(type.equals("SMS")){
            System.out.println("otp through SMS");
        }
    }
}
class LoanService{
    public void loanProcess(String type){
        if(type.equals("home")){
            System.out.println("home loan");
        }
        if(type.equals("personal")){
            System.out.println("personal loan");
        }
        if(type.equals("gold")){
            System.out.println("gold loan");
        }
    }

}


