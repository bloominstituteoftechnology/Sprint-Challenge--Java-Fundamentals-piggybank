package lambdaPiggybank;

public class Penny extends Money
{

	public Penny()
	{
		//set values is a higher order function that calls setters with the passed in arguments

		super.setValues("Nickel", 0.01, 1,1);

	}

	public Penny(int amountToAdd)
	{
		super.setValues("Penny", 0.01, amountToAdd, amountToAdd);

	}

}
