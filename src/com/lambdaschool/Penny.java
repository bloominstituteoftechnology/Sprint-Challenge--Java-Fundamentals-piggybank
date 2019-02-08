package com.lambdaschool;

public class Penny extends PiggyBank
{
    public Penny(int quant)
    {
        super(quant);
        this.value = .01;
    }

    public Penny()
    {
        this.value = .01;
    }

    @Override
    public String toString()
    {
        return (quant + " Penny");
    }

}




