package com.java.piggybank.models;

public abstract class Money {
    public int amount;
    // constructor
    public Money(int amount){
        this.amount = amount;
    }

    public Money() {
        this.amount+= 1;
    }

    // other methods
    public abstract double getValue();
    public abstract String getName();
}
