package com.primerparcial.email;

public interface Sender {
    public void sendEmail(String destinationEmail, String originEmail, String affair, String body);
}
