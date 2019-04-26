package com.chasegarsee.initial;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Money> piggyBank = new ArrayList<>();

        piggyBank.add(new Dollar(5, 1));
        piggyBank.add(new Quarter(1, 0));
        piggyBank.add(new Dime(17, 0));
        piggyBank.add(new Nickel(55, 0));
        piggyBank.add(new Penny(12, 0));


        piggyBank.forEach(piggy -> System.out.println(piggy.stringValue()));

        double myPiggies = 0.0;
        for (Money m : piggyBank)
        {
            myPiggies = myPiggies + m.getValue();
        }

        double notMyPiggies = 0.0;
        for (Money m : piggyBank)
        {
            notMyPiggies = myPiggies - notMyPiggies - m.getReducedValue();
        }
        System.out.println("*****************************");
        System.out.println('\n');
        System.out.println("MY PIGGIE HAS $" + myPiggies);
        System.out.println('\n');
        System.out.println("*****************************");
        System.out.println('\n');
        System.out.println("MY PIGGIE NOW HAS $" + notMyPiggies);
        System.out.println('\n');
        System.out.println("*****************************");
    }
}
