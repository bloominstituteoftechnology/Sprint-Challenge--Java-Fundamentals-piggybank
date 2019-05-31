package piggybank;

public class Quarter extends ChangeActions{

	public int ammount;
	public double value;

	public Quarter(int ammount)
	{
		this.ammount = ammount;
		this.value = ammount * 0.25;
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
		return ammount + " Quarter/s";
	};

}
