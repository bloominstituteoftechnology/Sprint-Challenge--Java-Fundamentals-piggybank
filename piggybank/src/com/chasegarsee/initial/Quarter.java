package com.chasegarsee.initial;

public class Quarter extends Money
{
    public Quarter(int count)
    {
        super(count);
        value = 0.25;
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
