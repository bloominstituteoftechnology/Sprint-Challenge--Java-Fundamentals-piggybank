package com.ebcitron.piggybank;

public class Penny extends Coin {

    public double value = .01;

    public Penny(double quantity) {
        super(quantity);
    }


    public double getTotal() {
        return value * this.getQuantity();
    }
}
