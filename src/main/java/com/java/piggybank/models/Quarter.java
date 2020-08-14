package com.java.piggybank.models;


public class Quarter extends Money {
    public Quarter(int amount) {
        super(amount);
    }

    @Override
    public double getValue() {
        return amount * .25;
    }

    @Override
    public String getName() {
        if (amount > 1) {
            return amount + "Quarters";
        } else {
            return amount + "Quarter";
        }
    }
}
