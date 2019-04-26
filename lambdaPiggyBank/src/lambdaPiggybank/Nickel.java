package lambdaPiggybank;

public class Nickel extends Money
{

	public Nickel()
	{
		//set values is a higher order function that calls setters with the passed in arguments

		super.setValues("Nickel", 0.25, 1, 1);

	}

	public Nickel(int amountToAdd)
	{
		super.setValues("Nickel", 0.05, amountToAdd, amountToAdd);

	}

}
