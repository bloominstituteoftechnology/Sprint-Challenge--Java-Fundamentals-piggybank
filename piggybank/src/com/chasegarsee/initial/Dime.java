package com.chasegarsee.initial;

public class Dime extends Money
{
    public Dime(int count)
    {
        super(count);
        value = 0.10;
    }

    @Override
    public String stringValue()
    {
        return "$$ " + count;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
