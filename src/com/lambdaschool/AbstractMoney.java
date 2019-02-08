package com.lambdaschool;

public class AbstractMoney
{
    private double value;
    private String name;
    private int count;

    AbstractMoney(int count, String name, double value)
    {
        this.count += count;
        this.name = name;
        this.value = value;
    }

    public double getValue()
    {
        return value;
    }

    public String getName()
    {
        return name;
    }

    public int getCount()
    {
        return count;
    }
}
