package piggybank;

public class Nickel extends ChangeActions{
	
	public int ammount;
	public double value;

	public Nickel(int ammount){
		this.ammount = ammount;
		this.value = ammount * 0.05;
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
		return ammount + " Nickel/s";
	};
}
