package com.lambdaschool;

public class Nickle extends AbstractMoney
{
    Nickle()
    {
        super(1);
        setName("Nickel");
        setValue(.05);
    }

    Nickle(int count)
    {
        super(count);
        setName("Nickel");
        setValue(.05);
    }

    @Override
    public String toString()
    {
        return this.getCount() + " Nickle";
    }
}
