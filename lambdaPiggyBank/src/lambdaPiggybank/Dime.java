package lambdaPiggybank;

public class Dime extends Money
{
	private String name;
	private double value = 0.10;
	private int amountStored;
	private int originalDeposit;

	public Dime()
	{
		super.setName("Dime");
		this.name = super.getName();
		originalDeposit = 1;
		amountStored = 1;
	}

	public Dime(int amountToAdd)
	{
		super.setName("Dime");
		this.name = super.getName();
		this.amountStored = amountStored + amountToAdd;
		this.originalDeposit = amountToAdd;
	}

	@Override
	public double tally()
	{
		return value * amountStored;
	}

	@Override
	public String toString()
	{
		return amountStored + " " + name + "\n";
	}
}
