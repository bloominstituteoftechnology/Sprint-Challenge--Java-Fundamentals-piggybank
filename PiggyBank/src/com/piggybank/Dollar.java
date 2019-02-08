package com.piggybank;

public class Dollar extends Currency {
    private String name = "Dollar";
    private double value = 1.00;
    private int amount = 0;
    private double total;
    public Dollar(){
        amount++;
    };
    public Dollar(int amt){
        this.amount += amt;

    }

    @Override
    public String getAmount() {
        return this.amount + " " + this.name;
    }
    @Override
    public double getTotal(){
        total = amount * value;
        return total;
    }

}
