package piggybank;

import java.util.ArrayList;

public class NationalBankOfPig{

	private double value;
	private ArrayList<MoneyActions> data;

	public double findTheValue(ArrayList<MoneyActions> toArray){
		for (MoneyActions money : toArray) {
			value += money.getValue();
			// https://www.tutorialspoint.com/java/java_assignment_operators_examples.htm
		}
		return value;
	};

	public NationalBankOfPig(ArrayList<MoneyActions> data)
	{
		this.data = data;
		this.value = findTheValue(data);
	};

	public ArrayList<MoneyActions> getData()
	{
		return data;
	};

	public double getValue()
	{
		this.value = 0.0;
		return findTheValue(data);
	};

	public void addSomeData(MoneyActions money)
	{
		this.data.add(money);
	};

	public void removeSomeData(MoneyActions money)
	{
		this.data.remove(money);
	}
};
