package com.lambda.sprint;

public class Penny extends Coin
{
    public Penny()
    {
        super();
        super.setValue(0.01);
        super.setName("Penny");
    }

    public Penny(int amount)
    {
        super(amount);
        super.setValue(0.01);
        super.setName("Penny");
    }
}
