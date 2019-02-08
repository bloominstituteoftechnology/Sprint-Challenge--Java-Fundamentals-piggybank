package com.lambdaschool;

public class Main {

    public static void main(String[] args) {
	    PiggyBank bank = new PiggyBank();
	    bank.add(new Quarter());
        bank.add(new Dime());
        bank.add(new Dollar(5));
        bank.add(new Nickel(3));
        bank.add(new Dime(7));
        bank.add(new Dollar());
        bank.add(new Penny(10));
        bank.printContents();
        System.out.println("The piggy bank holds $" + bank.getValue());

    }
}
