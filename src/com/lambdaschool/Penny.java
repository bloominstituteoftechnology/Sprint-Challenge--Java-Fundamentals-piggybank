package com.lambdaschool;

public class Penny extends AbstractMoney
{
    public Penny()
    {
        super(1, "Penny", .01);
    }

    public Penny(int count)
    {
        super(count, "Penny", .01);
    }

    @Override
    public String toString()
    {
        return this.getCount() + " Penny";
    }
}