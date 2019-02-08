package com.lambdaschool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<AbstractCurrency> piggyBank = new ArrayList<AbstractCurrency>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickle(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        piggyBank.forEach((v) -> System.out.println(v));

        double total = 0.0;
        for (AbstractCurrency i : piggyBank) {

            total += i.getQuantity() * i.getValue();
            System.out.println(total);

        }

        System.out.println("The piggy bank holds $" + total);







    }
}
