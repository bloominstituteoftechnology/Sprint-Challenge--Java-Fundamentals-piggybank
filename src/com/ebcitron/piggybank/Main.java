package com.ebcitron.piggybank;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Bank ElisBank;
        ElisBank = new Bank();


        ElisBank.addCoin( new Dime(3));
        ElisBank.addCoin(new Dollar(10));

        ElisBank.countFunds();

    }
}
