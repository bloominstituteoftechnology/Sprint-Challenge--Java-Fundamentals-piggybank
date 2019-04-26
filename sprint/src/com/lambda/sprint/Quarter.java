package com.lambda.sprint;

public class Quarter extends Coin
{
    public Quarter()
    {
        super();
        super.setValue(0.25);
        super.setName("Quarter");
    }

    public Quarter(int amount)
    {
        super(amount);
        super.setValue(0.25);
        super.setName("Quarter");
    }
}
