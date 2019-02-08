package com.harrisonbrock.money;

public class Dime implements Coin {
    private double totalAmount;
    private int amount;
    private final double VALUE = 0.10;

    public Dime() {
        amount = 1;
        this.totalAmount = amount * VALUE;
    }

    public Dime(int amount) {
        this.amount = amount;
        this.totalAmount= amount * VALUE;
    }

    @Override
    public int amountInserted() {
        return amount;
    }

    @Override
    public String getName() {
        return this.amount + " Dime";
    }

    @Override
    public double getAmount() {
        return totalAmount;
    }
}
