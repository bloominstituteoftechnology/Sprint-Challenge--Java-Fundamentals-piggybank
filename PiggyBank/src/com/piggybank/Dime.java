package com.piggybank;

public class Dime extends Currency {
    private String name = "Dime";
    private double value = 0.10;
    private int amount = 0;
    private double total;

    public Dime(){
        amount++;
    };
    public Dime(int amt){
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
