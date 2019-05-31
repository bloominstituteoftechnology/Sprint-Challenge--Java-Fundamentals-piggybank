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
		
		System.out.println("*** National Bank of Pig ***");
	}
}
