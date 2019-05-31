package piggybank;

public class Penny extends ChangeActions{

	private double value;
	private int ammount;

	public Penny(int ammount)
	{
		this.ammount = ammount;
		this.value = ammount * 0.01;
	};

	@Override
	public int getAmmount()
	{
		return ammount;
	};
	
	@Override
	public double getValue()
	{
		return value;
	};

	public void setAmmount(int ammount)
	{
		this.ammount = ammount;
	};

	@Override
	public String toString()
	{
		return ammount + " Pennies";
	};
}
