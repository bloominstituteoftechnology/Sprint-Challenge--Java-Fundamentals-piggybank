package com.piggybank;

public abstract class Currency {

    private double value;
    private int amount;
    private double total;
    public double getValue(){
        return this.value;
    };

    public String getAmount(){

        return  this.amount + " " ;
    }
    public double getTotal(){
        total = amount * value;
        return total;
    }
}
