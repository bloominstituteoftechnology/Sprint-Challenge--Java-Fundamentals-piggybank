package piggybank;

public class Dime extends ChangeActions{

	private int ammount;
	private double value;

	public Dime(int ammount)
	{
		this.ammount = ammount;
		this.value = ammount * 0.10 ;
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
		return ammount + " Dime/s";
		//https://www.tutorialspoint.com/java/java_basic_operators.htm
	};
}
