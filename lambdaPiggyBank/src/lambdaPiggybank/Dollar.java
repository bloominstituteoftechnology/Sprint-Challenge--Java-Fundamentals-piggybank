package lambdaPiggybank;

public class Dollar extends Money
{
	private static int totalAmountStored;


	public Dollar()
	{
		//set values is a higher order function that calls setters with the passed in arguments

		super.setValues("Dollar", 1, 1, 1);
		totalAmountStored += getAmountStored();

	}

	public Dollar(int amountToAdd)
	{
		super.setValues("Dollar", 1, amountToAdd, amountToAdd);
		totalAmountStored += getAmountStored();

	}



}
