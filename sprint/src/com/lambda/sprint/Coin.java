package com.lambda.sprint;

public abstract class Coin
{
    private int amount;
    private double value;
    private String name;
    private String plural;

    public Coin()
    {
        this.amount = 1;
        this.plural = "";
    }

    public Coin(int amount)
    {
        this.amount = amount;
        if ( amount > 1)
        {
            this.plural = "s";
        }
        else
        {
            this.plural = "";
        }

    }

    public int getAmount()
    {
        return amount;
    }

    public double getTotalValue()
    {
        return value * amount;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getValue()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return amount + " " + name + plural;
    }
}
