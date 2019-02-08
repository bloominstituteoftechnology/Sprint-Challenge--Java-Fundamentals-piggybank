package com.lambdaschool;

public class Dollar extends AbstractMoney
{
    public Dollar()
    {
        super(1, "Dollar", 1.00);
    }

    public Dollar(int count)
    {
        super(count, "Dollar", 1.00);
    }

    @Override
    public String toString()
    {
        return "$" + this.getCount();
    }
}