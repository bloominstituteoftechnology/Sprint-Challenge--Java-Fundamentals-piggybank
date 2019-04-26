package com.chasegarsee.initial;

public class Quarter extends Money
{
    public Quarter(int count, int reducedCount)
    {
        super(count, reducedCount);
        value = 0.25;
    }

    @Override
    public String stringValue()
    {
        return "Number of Quarters - " + count;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

}
