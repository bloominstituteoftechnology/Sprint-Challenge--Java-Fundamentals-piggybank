package com.chasegarsee.initial;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Money> piggyBank = new ArrayList<>();

        piggyBank.add(new Dollar(5));
        piggyBank.add(new Quarter(1));
        piggyBank.add(new Dime(17));
        piggyBank.add(new Nickel(55));
        piggyBank.add(new Penny(12));

        piggyBank.remove(new Dollar(-2));

        piggyBank.forEach(piggy -> System.out.println(piggy.stringValue()));

        double myPiggies = 0.0;
        for (Money m : piggyBank)
        {
            myPiggies = myPiggies + m.getValue();
        }


        System.out.println("MY PIGGIE HAS $" + myPiggies);

    }
}
