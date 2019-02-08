package com.lambdaschool;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("*** Here is my PiggyBank ***");

        // create arrayList that will act as the PigggyBank

        ArrayList<AbstractCoin> myBank = new ArrayList<AbstractCoin>();

        myBank.add(new Quarter());
        myBank.add(new Dime());
        myBank.add(new Dollar(5));
        myBank.add(new Nickle(3));
        myBank.add(new Dime(7));
        myBank.add(new Dollar());
        myBank.add(new Penny(10));

        // loop to print desired values

        for (int i = 0; i < myBank.size() ; i++)
        {
            System.out.println(myBank.get(i).toString());
        }
        // create var to hold total for printing

        double theTotal = 0.0;

        for (int i = 0; i < myBank.size(); i++)
        {
           theTotal += myBank.get(i).getCoinBal();

        }

        System.out.println("\nThe piggy bank holds $" + theTotal);









    }
}
