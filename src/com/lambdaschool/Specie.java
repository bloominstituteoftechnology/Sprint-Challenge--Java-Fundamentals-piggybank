package com.lambdaschool;

public abstract class Specie
{
    private double value;
    private double totalValue;
    private String name;
    private int number;

    public Specie(int number, double value, String name) {
        this.number = number;
        this.value = value;
        this.name = name;
        totalValue = (double)number * value;
    }

    public int getNumber()
    {
        return number;
    }

    public double getTotalValue()
    {
        return totalValue;
    }

    public String getName()
    {
        return name;
    }

}
