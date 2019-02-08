package com.harrisonbrock;

import com.harrisonbrock.money.Quater;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.add(new Quater());
        bank.add(new Quater(5));
        bank.print();
    }
}
