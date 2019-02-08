package com.lambdaschool;

public class main {
    public static void main(String[] args)
    {
        PiggyBank bank = new PiggyBank();
        bank.add(new Pennies(34));
        bank.add(new Nickels(3));
        bank.add(new Dimes(5));
        bank.add(new Quarters(4));

        bank.printContents();
        System.out.println("There is $" + bank.getValue() + " in the piggy bank.");
    }
}