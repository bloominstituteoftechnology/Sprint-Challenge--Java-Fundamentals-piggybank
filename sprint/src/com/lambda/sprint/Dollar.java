package com.lambda.sprint;

public class Dollar extends Coin
{
    public Dollar()
    {
        super();
        setValue(1);
        setName("$");
    }

    public Dollar(int amount)
    {
        super(amount);
        setValue(1);
        setName("$");
    }


    public String toString()
    {
        return getName() + getAmount();
    }
}
