package com.piggybank;

public class Quarter extends Currency {

    private String name = "Quarter";
    private double value = 0.25;
    private int amount = 0;
    private double total;
    public Quarter(){
        amount++;
    };
    public Quarter(int amt){
        this.amount += amt;

    }

    @Override
    public String getAmount() {
        return this.amount + " " + this.name;
    }
    public double getTotal(){
        total = amount * value;
        return total;
    }
}
