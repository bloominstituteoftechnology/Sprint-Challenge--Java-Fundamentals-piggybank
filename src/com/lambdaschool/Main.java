package com.lambdaschool;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] arg)
    {
        ArrayList<PiggyBank> piggyBank = new ArrayList<PiggyBank>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        piggyBank.forEach((i) -> System.out.println(i));

        double total = 0;
        for (PiggyBank j : piggyBank)
        {
            total += j.getQuant() * j.getValue();
        }

    System.out.println("The piggy bank holds $" + total);
    }
}
