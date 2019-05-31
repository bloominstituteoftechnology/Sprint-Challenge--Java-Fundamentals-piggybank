package piggybank;

public abstract class MoneyActions {

	private static int maxId = 0;
	public int id;
	public abstract int getAmmount();
	public abstract double getValue();
	
	public MoneyActions()
	{
		this.id = maxId++;
		// ++ increments by 1
	};

	public int getId()
	{
		return id;
	};
}
