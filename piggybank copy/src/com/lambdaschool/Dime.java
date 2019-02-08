package com.lambdaschool;

public class Dime extends AbstractCoin
{
    private  double coinVal = .1;
    private String coinName = "Dime";
    private int coinQuant;
    private double coinBal;

    public Dime(int coinQuant)
    {
        this.coinQuant = coinQuant;
    }

    public Dime()
    {
        this.coinQuant = 1;
    }



    public void setName(String coinName)
    {
        this.coinName = coinName;
    }

    public void setQuantity(int coinQuant)
    {
        this.coinQuant = coinQuant;
    }

    public void setBal(int coinQuant)
    {
        this.coinBal = this.coinQuant * this.coinVal;
    }

    @Override
    public String getCoinName()
    {
        return coinName;
    }

    public int getCoinQuant()
    {
        return coinQuant;
    }

    public double getCoinBal()
    {
        return coinQuant * coinVal;
    }

    @Override
    public String toString()
    {
        return coinQuant + " " + coinName;
    }
}
