package com.company;

public class TaxCalculator2019 implements TaxCalculator {

    @Override
    public float calculateTax() {
        return 1;
    }

    public float calculateInsurance() {
        return 0;
        // This change is not going to impact our main method.
        // Because we are programming to an interface not a concrete implementation.
    }
}
