package com.harrisonbrock;

import com.harrisonbrock.money.*;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.add(CoinFactory.addMoney("Quarter"));
        bank.add(CoinFactory.addMoney("Dime"));
        bank.add(CoinFactory.addMoney("Dollar", 5));
        bank.add(CoinFactory.addMoney("Nickle", 3));
        bank.add(CoinFactory.addMoney("Dime", 7));
        bank.add(CoinFactory.addMoney("Dollar"));
        bank.add(CoinFactory.addMoney("Penny", 10));
        bank.print();
    }
}
