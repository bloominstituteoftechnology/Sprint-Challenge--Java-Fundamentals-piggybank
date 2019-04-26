package com.chasegarsee.initial;

public class Penny extends Money
{
    public Penny(int count, int reducedCount)
    {
        super(count, reducedCount);
        value = 1.0;
    }

    @Override
    public String stringValue()
    {
        return "Number of Pennies - " + count;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
