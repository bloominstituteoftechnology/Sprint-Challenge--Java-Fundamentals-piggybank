package lambdaPiggybank;

public class Dime extends Money
{
	private static int totalAmountStored;

	public Dime()
	{
		//set values is a higher order function that calls setters with the passed in arguments

		super.setValues("Dime", 0.10, 1, 1);
		totalAmountStored += getAmountStored();

	}

	public Dime(int amountToAdd)
	{
		super.setValues("Quarter", 0.25, amountToAdd, amountToAdd);
		totalAmountStored += getAmountStored();

	}


}
