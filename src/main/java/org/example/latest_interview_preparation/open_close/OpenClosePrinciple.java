package org.example.latest_interview_preparation.open_close;

public class OpenClosePrinciple {
    public static void main(String[] args) {
     NotificationProcess notificationProcess = new NotificationProcess();
     EmailService service = new EmailService();
     WhatsAppService whatsAppService = new WhatsAppService();
     notificationProcess.process(whatsAppService);
    }
}


