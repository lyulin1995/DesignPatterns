package com.company;

public class MailService {
    public void sendEmail() {
        connect(1);
        authenticate();
        // send email;
        disconnect();
    }

    private void connect(int timeout) {
        System.out.println("Connect");
        // add a parameter here will not affect the main method.
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }
}
