package piggybank;

import java.util.ArrayList;

public class NationalBankOfPig{

	private double value;
	private ArrayList<AbstractMoney> arrayOfData;

	public double findTheValue(ArrayList<ChangeActions> toarray){
		for (ChangeActions money : toArray) {
			value += money.getValue();
			// https://www.tutorialspoint.com/java/java_assignment_operators_examples.htm
		};
		return value;
	};

	public NationalBankOfPig(ArrayList<ChangeActions> arrayOfData)
	{
		this.arrayOfData = arrayOfData;
		this.value = findTheValue(arrayOfData);
	};

	public ArrayList<ChangeActions> getData()
	{
		return arrayOfData;
	};

	public double getValue()
	{
		this.value = 0.0;
		return findValue(arrayOfData);
	};

	public void addSomeData(ChangeActions money)
	{
		this.arrayOfData.add(money);
	};
};
