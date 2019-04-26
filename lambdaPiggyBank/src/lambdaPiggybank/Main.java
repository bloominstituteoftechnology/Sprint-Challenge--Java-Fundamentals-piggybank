package lambdaPiggybank;

import java.util.ArrayList;

public class Main
{
	private static double total;
	public static void main(String[] args)
	{

		ArrayList<Money> piggyBank = new ArrayList<>();

		piggyBank.add(new Quarter());
		piggyBank.add(new Dime());
		piggyBank.add(new Dollar(3));
		piggyBank.add(new Nickel(3));
		piggyBank.add(new Penny(3));


		piggyBank.forEach(i -> total += i.tally());
		System.out.println("The piggy bank holds $" + total);



	}
}