package com.lambdaschool;

public class Quarter extends PiggyBank
{
    public Quarter(int quant)
    {
        super(quant);
        this.value = 0.25;
    }

    public Quarter()
    {
        this.value = 0.25;
    }

    @Override
    public String toString()
    {
        return (quant + " Quarter");
    }

}




