package com.chasegarsee.initial;

public abstract class Money
{
    int count = 1;
    int reducedCount = -1;
    double value;


     public Money(int count, int reducedCount)
     {
         this.count = count;
         this.reducedCount = reducedCount;
     }

     public double getValue()
     {
         return value * count;
     }


    public double getReducedValue()
    {
        return reducedCount * value;
    }

    public abstract String stringValue();

     @Override
    public String toString()
     {
         return "Money{" + "count = " + count + ", value = " + value + '\n';

     }
}
