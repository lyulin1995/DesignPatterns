package com.company.template;

public class TransferMoneyTask extends Task {
//    public TransferMoneyTask(AuditTrail auditTrail) {
//        super(auditTrail);
//        // The super() in Java is a reference variable that is used to refer parent class constructors.
//        // super can be used to call parent class' variables and methods.
//        // super() can be used to call parent class' constructors only.
//    }

    @Override
    protected void doExecute() {
        System.out.println("Transfer Money");
    }
}
