package lambdaPiggybank;

public class Penny extends Money
{
	private String name;
	private double value = 1;
	private int amountStored;
	private int originalDeposit;

	public Penny()
	{
		super.setName("Penny");
		this.name = super.getName();
		originalDeposit = 1;
		amountStored = 1;
	}

	public Penny(int amountToAdd)
	{
		super.setName("Penny");
		this.name = super.getName();
		this.amountStored = amountStored + amountToAdd;
		this.originalDeposit = amountToAdd;
	}

	@Override
	public double tally()
	{
		return amountStored * value;
	}

	@Override
	public String toString()
	{
		return amountStored + " " + name + "\n";
	}
}
