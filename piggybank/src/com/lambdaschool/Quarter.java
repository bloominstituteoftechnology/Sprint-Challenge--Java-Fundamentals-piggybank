package com.lambdaschool;

public class Quarter extends Money
{
    public Quarter(int count)
    {
        super(count);
        value = 0.25;
    }

    public Quarter()
    {
        value = 0.25;
    }

    @Override
    public String strValue()
    {
        return  count + " Quarter";
    }
}
