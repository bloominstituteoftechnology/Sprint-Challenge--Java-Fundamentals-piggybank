package com.harrisonbrock;

import com.harrisonbrock.money.Dime;
import com.harrisonbrock.money.Quarter;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.add(new Quarter());
        bank.add(new Dime(10));
        bank.print();
    }
}
