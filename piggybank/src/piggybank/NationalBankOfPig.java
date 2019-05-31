package piggybank;

import java.util.ArrayList;

public class NationalBankOfPig{

	private double value;
	private ArrayList<AbstractMoney> data;

	public double findTheValue(ArrayList<ChangeActions> toarray){
		for (ChangeActions money : toArray) {
			value += money.getValue();
			// https://www.tutorialspoint.com/java/java_assignment_operators_examples.htm
		} 
		return value;
	}

	public NationalBankOfPig(ArrayList<ChangeActions> data){
		this.data = data;
		this.value = findTheValue(data);
	}

}
