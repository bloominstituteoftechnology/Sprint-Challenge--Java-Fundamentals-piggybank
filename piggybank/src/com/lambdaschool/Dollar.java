package com.lambdaschool;

public class Dollar extends Money
{
    public Dollar(int count)
    {
        super(count);
        value = 1.0;
    }

    // without count to pass
    public Dollar()
    {
        value = 1.0;
    }

    @Override
    public String strValue()
    {
        return "$ " + count;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
