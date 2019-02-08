package com.lambdaschool;

public class Dollar extends PiggyBank
{
    public Dollar(int quant)
    {
        super(quant);
        this.value = 1.0;
    }

    public Dollar()
    {
        this.value = 1.0;
    }

    @Override
    public String toString()
    {
        return ("$" + quant);
    }

}


