package piggybank;

public abstract class MoneyActions {

	private static int maxId = 0;
	public int id;
	
	public MoneyActions(){
		this.id = maxId++;
		// ++ increments by 1
	}

	public abstract double getAmmount();
	public abstract int getValue();
	public int getId(){
		return id;
	}
}
