package lambdaPiggybank;

public class Dollar extends Money
{
	private String name;
	private double value = 1;
	private int amountStored;
	private int originalDeposit;

	public Dollar()
	{
		super.setName("Dollar");
		this.name = super.getName();
		originalDeposit = 1;
		amountStored = 1;
	}

	public Dollar(int amountToAdd)
	{
		super.setName("Dollar");
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
		return "$" + amountStored + "\n";
	}
}
