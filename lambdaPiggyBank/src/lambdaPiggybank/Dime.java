package lambdaPiggybank;

public class Dime extends Money
{
	private String name;
	private double value = 0.10;
	private int amountStored;
	private int originalDeposit;

	public Dime()
	{
		//set values is a higher order function that calls setters with the passed in arguments

		super.setValues("Dime", 0.10, 1, 1);

	}

	public Dime(int amountToAdd)
	{
		super.setValues("Quarter", 0.25, amountToAdd, amountToAdd);
	}


}
