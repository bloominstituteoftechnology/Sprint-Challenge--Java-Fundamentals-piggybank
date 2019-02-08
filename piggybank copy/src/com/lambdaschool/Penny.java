package com.lambdaschool;

public class Penny extends AbstractCoin
{
    private  double coinVal = .01;
    private String coinName = "Penny";
    private int coinQuant;
    private double coinBal;

    public Penny(int coinQuant)
    {
        this.coinQuant = coinQuant;
    }

    public Penny()
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
