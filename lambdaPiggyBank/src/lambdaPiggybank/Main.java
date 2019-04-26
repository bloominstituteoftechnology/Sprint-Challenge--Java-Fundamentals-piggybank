package lambdaPiggybank;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main
{
	private static double total;
	private static DecimalFormat fp = new DecimalFormat("$###,###.00");

	public static void main(String[] args)
	{

		ArrayList<Money> piggyBank = new ArrayList<>();

		piggyBank.add(new Quarter());
		piggyBank.add(new Dime());
		piggyBank.add(new Dollar(3));
		piggyBank.add(new Nickel(3));
		piggyBank.add(new Penny(33));

		System.out.println(piggyBank);
		piggyBank.forEach(i -> total += i.tally());
		System.out.println("The piggy bank holds " + fp.format(total));
	}

}