package com.ebcitron.piggybank;

public abstract class Coin {

     double value;
     double quantity = 1;


    public Coin(double quantity) {
        this.quantity = quantity;
    }

    public Coin() {

    }


    public abstract double getTotal();
    public  double getQuantity(){
        return quantity;
    }
}
