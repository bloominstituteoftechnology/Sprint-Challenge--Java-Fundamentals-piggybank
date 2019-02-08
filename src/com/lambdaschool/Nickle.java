package com.lambdaschool;

public class Nickle extends AbstractMoney
{
    public Nickle()
    {
        super(1, "Nickel", .05);
    }

    public Nickle(int count)
    {
        super(count, "Nickel", .05);
    }

    @Override
    public String toString()
    {
        return this.getCount() + " Nickle";
    }
}
