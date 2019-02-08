package com.lambdaschool;

public class Quarter extends AbstractMoney
{
    Quarter()
    {
        super(1);
        setName("Quarter");
        setValue(.25);
    }

    Quarter(int count)
    {
        super(count);
        setName("Quarter");
        setValue(.25);
    }

    @Override
    public String toString()
    {
        return this.getCount() + " Quarter";
    }
}
