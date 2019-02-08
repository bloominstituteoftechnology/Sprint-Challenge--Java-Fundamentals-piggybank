package com.harrisonbrock;

import com.harrisonbrock.money.Coin;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Bank {
    private double totalAmount;
    private List<String> orderMoneyInserted = new LinkedList<>();

    public Bank() {
        this.totalAmount = 0;
    }

    public void add(Coin money) {
        orderMoneyInserted.add(money.getName());
        this.totalAmount += money.getAmount();
    }

    public void print() {
        orderMoneyInserted.forEach(money -> System.out.println(money));

        System.out.println("The piggy bank holds: " + "$" + this.totalAmount);
    }

}
