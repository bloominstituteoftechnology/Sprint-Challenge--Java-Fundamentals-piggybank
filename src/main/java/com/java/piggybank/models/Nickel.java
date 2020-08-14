package com.java.piggybank.models;

public class Nickel extends Money{
    public Nickel(int amount) {
        super(amount);
    }

    @Override
    public double getValue() {
        return amount * .05;
    }

    @Override
    public String getName() {
        if (amount > 1) {
            return amount + "Nickels";
        } else {
            return amount + "Nickel";
        }
    }
}
