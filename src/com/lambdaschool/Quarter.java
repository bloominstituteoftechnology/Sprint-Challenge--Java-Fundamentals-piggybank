package com.lambdaschool;

public class Quarter extends AbstractMoney
{
    public Quarter()
    {
        super(1, "Quarter", .25);
    }

    public Quarter(int count)
    {
        super(count, "Quarter", .25);
    }

    @Override
    public String toString()
    {
        return this.getCount() + " Quarter";
    }
}
