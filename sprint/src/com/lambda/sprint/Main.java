package com.lambda.sprint;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Coin> piggyBank = new ArrayList<>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        piggyBank.forEach(c -> System.out.println(c));

        double total = 0;
        for (Coin c : piggyBank)
        {
            total += c.getTotalValue();
        }
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        System.out.println("\nThe piggy bank holds " + fp.format(total));
    }
}
