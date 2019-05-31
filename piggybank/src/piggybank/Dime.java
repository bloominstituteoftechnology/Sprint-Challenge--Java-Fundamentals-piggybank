package piggybank;

public class Dime extends ChangeActions{

	private double value;
	private int ammount;

	public Dime(int ammount)
	{
		this.ammount = ammount;
		this.value = value * 0.10 ;
	};

	@Override
	public double getValue()
	{
		return value;
	};

	@Override
	public int getAmmount()
	{
		return ammount;
	};

	public void setAmmount(int ammount)
	{
		this.ammount = ammount;
	};

	@Override
	public String toString()
	{
		return ammount + "Dime/s" + "\n";
		//https://www.tutorialspoint.com/java/java_basic_operators.htm
	};
}
