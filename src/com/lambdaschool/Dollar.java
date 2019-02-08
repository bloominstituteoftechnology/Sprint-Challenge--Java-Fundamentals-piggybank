package com.lambdaschool;

public class Dollar extends AbstractCurrency {

    public Dollar(int quantity) {
        super(quantity);
        this.value = 1.00;
    }

    public Dollar() {
        this.value = 1.00;
    }

    @Override
    public String toString() {
        return "$" + quantity;
    }

}
