package com.harrisonbrock.money;

public class Dollar implements Coin {
    private double totalAmount;
    private int amount;
    private final double VALUE = 1;

    public Dollar() {
        amount = 1;
        this.totalAmount = amount * VALUE;
    }

    public Dollar(int amount) {
        this.amount = amount;
        this.totalAmount= amount * VALUE;
    }

    @Override
    public int amountInserted() {
        return amount;
    }

    @Override
    public String getName() {
        return "$" + getAmount();
    }

    @Override
    public double getAmount() {
        return totalAmount;
    }
}
