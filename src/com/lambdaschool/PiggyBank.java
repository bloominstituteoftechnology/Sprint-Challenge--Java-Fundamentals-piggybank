package com.lambdaschool;

public class PiggyBank
{
//    A Dollar worth $1.00
//    A Quarter worth $0.25
//    A Dime worth $0.10
//    A Nickel worth $0.05
//    A Penny worth $0.01
//    Each coin object should know its value, how many of that coin is in the object, and how to print its value.
    public double value;
    public int quant;

    public PiggyBank(int quant)
    {
        this.quant = quant;
    }

    public PiggyBank()
    {
        this.quant = 1;
    }

    public double getValue()
    {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public int getQuant()
    {
        return quant;
    }

    public void setQuant(int quant)
    {
        this.quant = quant;
    }
}