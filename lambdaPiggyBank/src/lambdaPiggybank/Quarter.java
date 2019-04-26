package lambdaPiggybank;

public class Quarter extends Money
{
	private String name;
	private double value = 0.25;
	private int amountStored;
	private int originalDeposit;

	public Quarter()
	{
		super.setName("Quarter");
		this.name = super.getName();
		originalDeposit = 1;
		amountStored = 1;
	}

	public Quarter(int amountToAdd)
	{
		super.setName("Quarter");
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
