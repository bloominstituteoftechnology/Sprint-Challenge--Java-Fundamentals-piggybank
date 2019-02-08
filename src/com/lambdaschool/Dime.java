package com.lambdaschool;

public class Dime extends AbstractMoney
{
    public Dime()
    {
        super(1, "Dime", .10);
    }

    public Dime(int count)
    {
        super(count, "Dime", .10);
    }

    @Override
    public String toString()
    {
        return this.getCount() + " Dime";
    }
}
