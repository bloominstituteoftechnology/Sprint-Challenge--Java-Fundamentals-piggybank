package piggybank;

public class Dollar extends MoneyActions{

	private double value;
	private int ammount;
	// private values, cant be accessed or seen by other classes, ONLY the parent and or child


	public Dollar(int ammount)
	{
		this.ammount = ammount;
		this.value = ammount * 1.00;
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

	@Override
	public String toString()
	{
		return ammount + " Dollar /s" ;
	};
}
