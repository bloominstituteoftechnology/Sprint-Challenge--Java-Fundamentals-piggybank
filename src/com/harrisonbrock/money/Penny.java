package com.harrisonbrock.money;

public class Penny implements Coin {
    private double totalAmount;
    private int amount;
    private final double VALUE = 0.01;

    public Penny() {
        amount = 1;
        this.totalAmount = amount * VALUE;
    }

    public Penny(int amount) {
        this.amount = amount;
        this.totalAmount= amount * VALUE;
    }

    @Override
    public int amountInserted() {
        return amount;
    }

    @Override
    public String getName() {
        return this.amount + " Penny";
    }

    @Override
    public double getAmount() {
        return totalAmount;
    }
}
