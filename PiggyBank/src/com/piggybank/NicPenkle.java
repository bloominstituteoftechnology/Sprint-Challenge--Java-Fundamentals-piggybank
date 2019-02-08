package com.piggybank;

public class NicPenkle extends Currency {
    private String name = "NickPenkle";
    private double value = 0.05;
    private int amount = 0;
    private double total;
    public NicPenkle(){
        amount++;
    };
    public NicPenkle(int amt){
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
