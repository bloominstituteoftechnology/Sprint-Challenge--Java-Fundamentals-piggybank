package piggybank;

import java.util.*;


public abstract class Coin
{
	//attributes

	private double coinValue; 
	private int amountAdded;

	

	//constructor 
	public Coin(double coinValue, int amountAdded /*double totalValue*/)
	{
		this.coinValue = coinValue;
		this.amountAdded = amountAdded;
		// this.totalValue = totalValue 
	}


	//methods

	// public void totalValue() /*(double coinValue, int amountAdded)*/
	// {
	// 	// int a = amountAdded;

	// 	// totalValue = Double(a) * coinValue;



	// 	System.out.println("Within Coin.java!");
	// 	System.out.println(totalValue);
	// }

	public double totalValue()
	{
		double totalValue = amountAdded * coinValue;
		return totalValue;
	}

}