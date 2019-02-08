package com.lambdaschool;

public class Nickle extends AbstractCurrency {
    public Nickle(int quantity) {
        super(quantity);
        this.value = 0.05;
    }

    public Nickle() {
        this.value = 0.05;
    }

    @Override
    public String toString() {
        return quantity + " Nickle";
    }
}
