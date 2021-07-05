package piggybank;

import java.util.*;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String args [])
	{
		DecimalFormat fp = new DecimalFormat("$###,###.00");

		//HashMap 
		// System.out.println("***HashMap***");
		// HashMap<String, Amount> Bank = new HashMap <>();

		//array list
		System.out.println("***Array List***");
		ArrayList<Coin> coin = new ArrayList<Coin>();

		coin.add(new Dime(20));
		coin.add(new Penny(3));

		coin.forEach(i -> System.out.println(i.totalValue()));
		System.out.println("In Main.java");

	}
}