package piggybank;

public class Dime extends ChangeActions{

	public int ammount;
	private double value;

	public Dime(int ammount){
		this.ammount = ammount;
		this.value = value * .10 ;
	};

	@Override
	public int getAmmount(){
		return ammount;
	};

	@Override
	public double getValue(){
		return value;
	};

	public void setAmmount(int ammount){
		this.ammount = ammount;
	}

	@Override
	public String tosString(){
		return ammount + "Dime/s" + "\n";
		//https://www.tutorialspoint.com/java/java_basic_operators.htm
	};
}
