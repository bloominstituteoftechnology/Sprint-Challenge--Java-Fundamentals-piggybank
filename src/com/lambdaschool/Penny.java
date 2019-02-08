package com.lambdaschool;

public class Penny extends AbstractCurrency {
    public Penny(int quantity) {
        super(quantity);
        this.value = 0.01;
    }

    public Penny() {
        this.value = 0.01;
    }

    @Override
    public String toString() {
        return quantity + " Penny";
    }
}
