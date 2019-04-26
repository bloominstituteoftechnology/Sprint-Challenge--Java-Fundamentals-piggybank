package com.chasegarsee.initial;

public class Nickel extends Money
{
    public Nickel(int count, int reducedCount)
    {
        super(count, reducedCount);
        value = 0.05;
    }

    @Override
    public String stringValue()
    {
        return "Number of Nickels - " + count;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

}