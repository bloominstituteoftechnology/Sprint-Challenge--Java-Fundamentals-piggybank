package com.java.piggybank.models;

public class Penny extends Money {
    public Penny(int amount) {
        super(amount);
    }

    @Override
    public double getValue() {
        return amount * .01;
    }

    @Override
    public String getName() {
        if (amount > 1) {
            return amount + "Pennies";
        } else {
            return amount + "Penny";
        }
    }

}
