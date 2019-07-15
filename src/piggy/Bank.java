package piggy;

public class Bank extends Worth{
	public double value;
	
	public Bank(double value){
		this.value = value ;
	}

	public double getAll(){
		return value;
	}

	public double getMore(int times){
		return value * times;
	}

	@Override
	public String toString(){
		String str = String.valueOf(value); 
		return str;
		// return "value"+value;
	}
}