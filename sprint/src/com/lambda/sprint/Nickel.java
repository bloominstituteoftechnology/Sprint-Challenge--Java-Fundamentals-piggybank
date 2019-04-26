package com.lambda.sprint;

public class Nickel extends Coin
{
    public Nickel()
    {
        super();
        super.setValue(0.05);
        super.setName("Nickel");
    }

    public Nickel(int amount)
    {
        super(amount);
        super.setValue(0.05);
        super.setName("Nickel");
    }
}
