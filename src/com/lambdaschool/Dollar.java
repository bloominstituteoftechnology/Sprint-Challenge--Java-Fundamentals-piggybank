package com.lambdaschool;

public class Dollar extends AbstractMoney
{
    Dollar()
    {
        super(1);
        setName("Dollar");
        setValue(1.00);
    }

    Dollar(int count)
    {
        super(count);
        setName("Dollar");
        setValue(1.00);
    }

    @Override
    public String toString()
    {
        return "$" + this.getCount();
    }
}