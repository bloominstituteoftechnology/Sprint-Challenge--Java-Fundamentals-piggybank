package com.ebcitron.piggybank;

public class Dime extends Coin {

    public double value = .1;

    public Dime(double quantity) {
        super(quantity);
    }

    public Dime() {
        super();
    }


    public double getTotal() {
        return value * this.getQuantity();
    }
}
