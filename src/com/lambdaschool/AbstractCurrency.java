package com.lambdaschool;

public abstract class AbstractCurrency {
    double value;
    int quantity;

    public AbstractCurrency(int quantity){
        this.quantity = quantity;
    }

    public AbstractCurrency(){
        this.quantity = 1;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
