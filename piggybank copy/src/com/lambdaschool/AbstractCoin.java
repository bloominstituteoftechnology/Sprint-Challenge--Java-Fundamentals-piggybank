package com.lambdaschool;

public abstract class AbstractCoin
{
    int coinQuant;
    double coinVal;
    String coinName;
    double coinBal;

    public AbstractCoin(int coinQuant)
    {
        this.coinQuant = coinQuant;
    }

    public AbstractCoin()
    {
        coinQuant = 1;
    }

    public int getCoinQuant()
    {
        return coinQuant;
    }

    public double getCoinVal()
    {
        return coinVal;
    }

    public String getCoinName()
    {
        return coinName;
    }

    public double getCoinBal()
    {
        return coinVal * coinQuant;
    }
}
