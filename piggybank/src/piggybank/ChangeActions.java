package piggybank;

public abstract class ChangeActions extends MoneyActions{

	private String type;
	public abstract double getAmmount();
	public abstract int getValue();

	public ChangeActions(){
		this.type = "coin.";
	};


	public String getType(){
		return type;
	}
}
