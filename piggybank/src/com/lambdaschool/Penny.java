package com.lambdaschool;

public class Penny extends Money
{
    public Penny(int count)
    {
        super(count);
        value = 0.01;
    }

    public Penny ()
    {
        value = 0.01;
    }

    @Override
    public String strValue()
    {
        return count + " Penny";
    }

//    @Override
//    public String toString()
//    {
//        return super.toString();
//    }
}
