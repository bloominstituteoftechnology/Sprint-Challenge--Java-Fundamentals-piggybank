package lambdaPiggybank;

import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Main
{
	private static double total;
	private static DecimalFormat fp = new DecimalFormat("$###,###.00");

	public static void main(String[] args)
	{

		Quarter testQuarter = new Quarter(3);

		ArrayList<Money> piggyBank = new ArrayList<>();

		piggyBank.add(testQuarter);
		piggyBank.add(new Quarter());
		piggyBank.add(new Quarter(3));
		piggyBank.add(new Dime());
		piggyBank.add(new Dollar(3));
		piggyBank.add(new Nickel(3));
		piggyBank.add(new Penny(33));
		piggyBank.add(new Penny(33));

		HashMap<String, Integer> piggyBankHash = new HashMap<>();

		//Adds item from piggyBank array list if the key of item name doesn't exist, else adds the amount stored
		for (Money item : piggyBank)
		{
			Set<String> keys = piggyBankHash.keySet();

			if (!keys.contains(item.getName()))
			{
				piggyBankHash.put(item.getName(), 0);
			}

			piggyBankHash.put(item.getName(), piggyBankHash.get(item.getName()) + item.getAmountStored());
		}


		System.out.println(piggyBankHash);

		piggyBank.forEach(i -> total += i.tally());
		System.out.println("The piggy bank holds " + fp.format(total));
	}

}