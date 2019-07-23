package com.chasegarsee.initial;

public class Dime extends Money
{
    public Dime(int count, int reducedCount)
    {
        super(count, reducedCount);
        value = 0.10;
    }

    @Override
    public String stringValue()
    {
        return "Number of Dimes - " + count;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
