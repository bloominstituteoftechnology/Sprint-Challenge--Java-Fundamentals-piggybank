package com.lambdaschool;

public class Nickel extends PiggyBank
{
    public Nickel(int quant)
    {
        super(quant);
        this.value = .05;
    }

    public Nickel()
    {
        this.value = .05;
    }

    @Override
    public String toString()
    {
        return (quant + " Nickel");
    }

}




