package com.harrisonbrock.money;

public class Quarter implements Coin {
    private double totalAmount;
    private int amount;
    private final double VALUE = 0.25;

    public Quarter() {
        amount = 1;
        this.totalAmount = amount * VALUE;
    }

    public Quarter(int amount) {
        this.amount = amount;
        this.totalAmount= amount * VALUE;
    }

    @Override
    public int amountInserted() {
        return amount;
    }

    @Override
    public String getName() {
        return this.amount +" Quarter";
    }

    @Override
    public double getAmount() {
        return totalAmount;
    }
}
