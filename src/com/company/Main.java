package com.company;

public class Main {

    public static void main(String[] args) {
	    User user = new User("Mosh", 30);
        System.out.println(user.name);
        user.sayHello();

        // In the example, the main class is coupled or dependent on the user class.
        // If you change the User class, the main class might be affected.
        // All the class dependent on the changed class have to be recompiled.

        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
        // In this method we have a dependency or coupling to this interface.
        // As long as we keep the signature of calculateTax() method exactly as these,
        // we are not going to have a breaking change.

        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

        var mailService = new MailService();
        mailService.sendEmail();
        // customers don't care about the connect/disconnect/auth methods.

    }
    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();

    }
}
