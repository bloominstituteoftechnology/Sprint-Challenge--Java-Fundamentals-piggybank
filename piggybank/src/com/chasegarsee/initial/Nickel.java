package com.chasegarsee.initial;

public class Nickel extends Money
{
    public Nickel(int count)
    {
        super(count);
        value = 0.05;
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