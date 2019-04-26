package com.lambda.sprint;

public class Dime extends Coin
{
    public Dime()
    {
        super();
        super.setValue(0.10);
        super.setName("Dime");
    }

    public Dime(int amount)
    {
        super(amount);
        super.setValue(0.10);
        super.setName("Dime");
    }
}
