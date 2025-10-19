package com.primerparcial.email;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailSenderTest {
    @Test
    @DisplayName("sendEmail debe imprimir el mensaje formateado correctamente")
    void sendEmailShouldPrintCorrectlyFormattedMessage() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        EmailSender emailSender = new EmailSender();
        String destination = "test@destino.com";
        String origin = "test@origen.com";
        String affair = "affair";
        String body = "body.";
        String expectedOutput = "Enviando email:\n " +
                "To: " + destination + "\n " +
                "From: " + origin + "\n " +
                "Subject: " + affair + "\n " +
                "Body: " + body;
        emailSender.sendEmail(destination, origin, affair, body);
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
