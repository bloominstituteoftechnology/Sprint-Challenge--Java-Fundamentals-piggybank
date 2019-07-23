package com.chasegarsee.initial;

public class Dollar extends Money
{
    public Dollar(int count, int reducedCount)
    {
        super(count, reducedCount);
        value = 1.0;
    }

    @Override
    public String stringValue()
    {
        return "Number of Dollars - " + count;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

}
