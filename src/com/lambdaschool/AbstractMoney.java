package com.lambdaschool;

public class AbstractMoney
{
    private double value;
    private String name;
    private int count;

    AbstractMoney(int count)
    {
        this.count += count;
    }

    public double getValue()
    {
        return value;
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

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }
}
