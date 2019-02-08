package com.lambdaschool;

public class Penny extends AbstractMoney
{
    Penny()
    {
        super(1);
        setName("Penny");
        setValue(.01);
    }

    Penny(int count)
    {
        super(count);
        setName("Penny");
        setValue(.01);
    }

    @Override
    public String toString()
    {
        return this.getCount() + " Penny";
    }
}