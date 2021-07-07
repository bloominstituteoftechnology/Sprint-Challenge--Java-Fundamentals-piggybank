package com.ebcitron.piggybank;
import java.util.*;
import  java.text.DecimalFormat;


public class Bank {


    private ArrayList<Coin> coinArr = new ArrayList<Coin>();

    DecimalFormat DF = new DecimalFormat("$###,###.00");

    public Bank() {

    }

    public  void addCoin(Coin newCoin){
        coinArr.add(newCoin);
    }

    public void countFunds() {

        double arrValue = 0;
        for (Coin coin : coinArr) {
            System.out.println(coin.toString());
            arrValue += coin.getTotal();
        }
        System.out.println("You have " + DF.format(arrValue));



}

}
