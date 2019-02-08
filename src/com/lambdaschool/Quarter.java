package com.lambdaschool;

public class Quarter extends AbstractCurrency{
    public Quarter(int quantity) {
        super(quantity);
        this.value = 0.25;
    }

    public Quarter() {
        this.value = 0.25;
    }

    @Override
    public String toString() {
        return quantity + " Quarter";
    }
}
