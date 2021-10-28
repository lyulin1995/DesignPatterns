package com.company.template;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task() {
        // default constructor
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        // template method
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
    // private method are not inherited with subclasses.
    // protected is similar to the private in the sense that it hides this method
    // within this class, but it makes it visible to the subclasses.
}
