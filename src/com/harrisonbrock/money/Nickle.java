package com.harrisonbrock.money;

public class Nickle implements Coin{
    private double totalAmount;
    private int amount;
    private final double VALUE = 0.05;

    public Nickle() {
        amount = 1;
        this.totalAmount = amount * VALUE;
    }

    public Nickle(int amount) {
        this.amount = amount;
        this.totalAmount= amount * VALUE;
    }

    @Override
    public int amountInserted() {
        return amount;
    }

    @Override
    public String getName() {
        return this.amount + " Nickle";
    }

    @Override
    public double getAmount() {
        return totalAmount;
    }
}
