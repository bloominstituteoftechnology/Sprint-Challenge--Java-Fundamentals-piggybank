package com.ebcitron.piggybank;

public class Dollar extends Coin {

    public double value = 1;

    public Dollar(double quantity) {
        super(quantity);
    }


    public double getTotal() {
        return value * this.getQuantity();
    }
}
