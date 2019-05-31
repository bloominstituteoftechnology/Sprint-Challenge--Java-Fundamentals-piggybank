package piggybank;

public abstract class ChangeActions extends MoneyActions{

	private String type;
	public abstract int getAmmount();
	public abstract double getValue();

	public ChangeActions(){
		this.type = "coin.";
	};


	public String getType(){
		return type;
	};
}
