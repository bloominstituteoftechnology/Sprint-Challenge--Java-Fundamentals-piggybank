package piggybank;

public class Dollar extends MoneyActions{

	private double value;
	private int ammount;
	// private values, cant be accessed or seen by other classes, ONLY the parent and or child


	public Dollar(int ammount){
		this.ammount = ammount;
		this.value = 1.00 * ammount;
	}

	@Override
	public double getAmmount(){
		return ammount;
	}

	@Override
	public int getValue(){
		return value;
	}

	@Override
	public String toString() {
		return "$" + value + ". \n" ;
	}
}
