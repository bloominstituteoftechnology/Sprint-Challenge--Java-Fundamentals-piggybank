package com.lambdaschool;

public abstract class Money
{
    int count = 1;  // how many quality of that money
    double value;  // money value

    // constructor access private variable
    public Money(int count)
    {
        this.count = count;
    }

    public Money()
    {

    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public double getValue()
    {
        return value * count;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public abstract String strValue();

    // print out the variables
    @Override
    public String toString()
    {
        return "Money{" +
                "count=" + count +
                ", value=" + value + '\n' ;
//                '}';
    }
}



