package org.example.latest_interview_preparation.open_close;

public class EmailService implements NotificationService{
    @Override
    public void sendOTP() {
        System.out.println("sending otp through mail");
    }
}
