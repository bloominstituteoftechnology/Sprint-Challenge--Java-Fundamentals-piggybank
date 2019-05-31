package piggybank;

import java.util.*;
// WARNING: this imports the WHOLE package. importing the whole package can lead to a larger file size than needed.
import java.text.DecimalFormat;
// info > https://www2.cs.arizona.edu/classes/cs210/fall17/lectures/decimal_format.pdf

public class Main 
{
	public static void main(String[] args)
	// main method
	{
		DecimalFormat fp = new DecimalFormat("$###,###.00");

		Quarter quarter = new Quarter(1);
        Dime dime = new Dime(1);
        Dollar dollar = new Dollar(5);
        Nickel nickel = new Nickel(3);
        Dime dime2 = new Dime(7);
        Dollar dollar2 = new Dollar(1);
		Penny penny = new Penny(10);
		
		System.out.println("*** National Bank of Pig ***" + "\n");
		
		ArrayList<MoneyActions> theBank2 = new ArrayList<MoneyActions>();
		NationalBankOfPig theBank = new NationalBankOfPig(theBank2);
		
		theBank2.add(quarter);
		theBank2.add(dime);
		theBank.addSomeData(dollar);
		theBank2.add(nickel);
		theBank2.add(dime2);
		theBank.addSomeData(dollar2);
		theBank2.add(penny);

		System.out.println("You: Hi, id like to make a withdraw");
		System.out.println("Interaction: Points Gun at other pigs.");
		System.out.println("Janet: puh, p p p p p please dont hurt us...");
		System.out.println("You: Give me all the money!!!");
		System.out.println("Janet opens the till and gives you " + theBank.getData().toString() + " totaling " + fp.format(theBank.getValue()) + ".");
		System.out.println("Janet: This is all we have, please dont shoot");

		theBank2.remove(quarter);
		theBank2.remove(dime);
		theBank.removeSomeData(dollar);
		theBank2.remove(nickel);
		theBank2.remove(dime2);
		theBank.removeSomeData(dollar2);
		theBank2.remove(penny);

		System.out.println("Now janets till contains " + fp.format(theBank.getValue()) + " and you've sucessfully robbed a bank." + " You better run fast. " );
	}
}
