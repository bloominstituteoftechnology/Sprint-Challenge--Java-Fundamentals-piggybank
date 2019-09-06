package piggybank;

import java.util.*;


public abstract class Coin
{
	//attributes

	private double coinValue; 
	private int amountAdded;
	// private double totalValue; 

	//constructor 
	public Coin(double coinValue, int amountAdded /*double totalValue*/)
	{
		this.coinValue = coinValue;
		this.amountAdded = amountAdded;
		// this.totalValue = totalValue 
	}
	

	//methods

	public void totalValue(double coinValue, int amountAdded)
	{
		int amountAdded = amountAdded;

		totalValue = Double(amountAdded) * coinValue;
	
		

		System.out.println("Within Coin.java!")
		System.out.println(totalValue)
	}

}