package lambdaPiggybank;

public class Dollar extends Money
{
	private String name;
	private double value = 1;
	private int amountStored;
	private int originalDeposit;

	public Dollar()
	{
		//set values is a higher order function that calls setters with the passed in arguments

		super.setValues("Dollar", 1, 1, 1);

	}

	public Dollar(int amountToAdd)
	{
		super.setValues("Dollar", 1, amountToAdd, amountToAdd);
	}



}
