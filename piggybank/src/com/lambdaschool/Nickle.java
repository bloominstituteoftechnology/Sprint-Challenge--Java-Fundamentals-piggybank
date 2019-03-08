package com.lambdaschool;

public class Nickle extends Money
{
    public Nickle(int count)
    {
        super(count);
        value = 0.05;
    }

    public Nickle()
    {
        value = 0.05;
    }

    @Override
    public String strValue()
    {
        return count + " Nickle";
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
