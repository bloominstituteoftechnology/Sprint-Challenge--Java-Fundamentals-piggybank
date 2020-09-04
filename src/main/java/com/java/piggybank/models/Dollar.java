package com.java.piggybank.models;

public class Dollar extends Money {
    public Dollar(int amount) {
        super(amount);
    }

    @Override
    public double getValue() {
        return amount * 1.00;
    } //how much our dollar is worth

    @Override
    public String getName() {
        if (amount > 1) {
            return amount + "Dollars";
        } else {
            return amount + "Dollar";
        }
    }

}
