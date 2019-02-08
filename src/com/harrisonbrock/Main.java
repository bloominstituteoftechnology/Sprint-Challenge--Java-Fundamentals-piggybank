package com.harrisonbrock;

import com.harrisonbrock.money.*;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.add(new Quarter());
        bank.add(new Dime());
        bank.add(new Dollar(5));
        bank.add(new Nickle(3));
        bank.add(new Dime(7));
        bank.add(new Dollar());
        bank.add(new Penny(10));
        bank.print();
    }
}
