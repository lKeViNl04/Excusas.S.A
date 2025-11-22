package com.primerparcial.email;

public class EmailSender implements Sender{
    @Override
    public void sendEmail(String destinationEmail, String originEmail, String affair, String body) {
        System.out.println("Sending email:\n " +
                "To: " + destinationEmail +"\n " +
                "From: " + originEmail +"\n " +
                "Subject: " + affair +"\n " +
                "Body: " + body);
    }
}
