package com.lambdaschool;

public class Dime extends AbstractMoney
{
    Dime()
    {
        super(1);
        setName("Dime");
        setValue(.10);
    }

    Dime(int count)
    {
        super(count);
        setName("Dime");
        setValue(.10);
    }

    @Override
    public String toString()
    {
        return this.getCount() + " Dime";
    }
}
