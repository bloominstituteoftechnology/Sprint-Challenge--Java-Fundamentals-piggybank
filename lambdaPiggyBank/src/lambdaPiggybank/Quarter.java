package lambdaPiggybank;

public class Quarter extends Money
{

	public Quarter()
	{
		//set values is a higher order function that calls setters with the passed in arguments
		super.setValues("Quarter", 0.25, 1, 1);

	}

	public Quarter(int amountToAdd)
	{
		super.setValues("Quarter", 0.25, amountToAdd, amountToAdd);
	}

}
