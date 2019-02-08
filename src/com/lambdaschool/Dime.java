package com.lambdaschool;

public class Dime extends PiggyBank
{
    public Dime(int quant)
    {
        super(quant);
        this.value = 0.10;
    }

    public Dime()
    {
        this.value = 0.10;
    }

    @Override
    public String toString()
    {
        return (quant + " Dime");
    }

}




