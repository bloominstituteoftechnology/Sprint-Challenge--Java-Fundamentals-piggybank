package lambdaPiggybank;

/*
Create a collection (array, arraylist, or hashmap) to represent the piggy bank. The collection can hold money.
This money can be

A Dollar worth $1.00
A Quarter worth $0.25
A Dime worth $0.10
A Nickel worth $0.05
A Penny worth $0.01
When creating a coin object, you can optionally give the number of coins being added. If no number is given, the default is 1 coin being added to the piggy bank.

Each coin object should know

- its value
- how many of that coin was added when that object was created
- how to print its total value which is value * number of coins added.
 */
public abstract class Money
{

	private String name;
	private double value;
	private int amountStored;
	private int originalDeposit;

	public Money()
	{

	}

	//takes in parameters to alter variables
	public void setValues(String name, double value, int amountStored, int originalDeposit)
	{
		this.name = name;
		this.value = value;
		this.amountStored = amountStored;
		this.originalDeposit = originalDeposit;
	}

	//gets a total worth of items
	public double tally()
	{
		return this.value * this.amountStored;
	};

	public int getAmountStored()
	{
		return amountStored;
	}

	public void setAmountStored(int amountStored)
	{
		this.amountStored = amountStored;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public String toString()
	{
		if (amountStored > 1)
		{
			return "\n" + amountStored + " " + name + "'s";
		} else {
			return "\n" + amountStored + " " + name;
		}
	}
}
