package com.lambdaschool;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Money> piggyBank = new ArrayList<Money>();

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar( 5));
        piggyBank.add(new Nickle(3));
        piggyBank.add(new Dime( 7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny( 10));

        piggyBank.forEach(p -> System.out.println(p.strValue()));

        double myValue = 0.0;
        for(Money m : piggyBank)
        {
            myValue = myValue + m.getValue();
        }

        System.out.println("******************************* ");
        System.out.println("The piggy bank holds $"+ myValue);
        System.out.println("******************************* \n");
//        System.out.println("The piggybank have the following count and value : \n " + piggyBank.toString());

//        PiggyBank piggyBank = new PiggyBank(1.00,0.25,0.10, 0.05, 0.01);
//
//        System.out.println("this is the piggyBank object" + piggyBank.getDollar());
//        System.out.println("piggBank object : " + piggyBank.toString());
//
//        piggyBank.setDollar(10);
//        piggyBank.setPenny(5);
//        System.out.println("After set dollar & penny in piggybank: " + piggyBank.toString());
    }
}
