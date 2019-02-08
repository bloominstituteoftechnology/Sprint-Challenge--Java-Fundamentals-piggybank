package com.lambdaschool;

public class Main
{
    public static void main(String[] args)
    {
        PiggyBank piggyBank = new PiggyBank();

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickle(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        piggyBank.printContents();
        piggyBank.printValue();
    }
}
