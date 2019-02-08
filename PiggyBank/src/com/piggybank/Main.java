package com.piggybank;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Quarter quarter = new Quarter(5);
//
//        System.out.println(quarter.getAmount());
//
//        System.out.println(quarter.getTotal());
//        System.out.println();
        double total = 0;
        ArrayList<Currency> piggyBank = new ArrayList();

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new NicPenkle(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());


        for (int i = 0; i< piggyBank.size(); i++){
            System.out.println(piggyBank.get(i).getAmount());
        }
        for (int i = 0; i < piggyBank.size(); i++){
            total += piggyBank.get(i).getTotal();
        }
        System.out.println("The total amount is " + total);
    }
}
