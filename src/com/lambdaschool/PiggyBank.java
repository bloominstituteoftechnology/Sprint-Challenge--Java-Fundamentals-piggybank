package com.lambdaschool;

public class PiggyBank
{
    private AbstractMoney[] store = new AbstractMoney[1000];
    private int storeIndex = 0;
    private double currentValue = 0;
    private int dollarCount = 0;
    private int quarterCount = 0;
    private int dimeCount = 0;
    private int nickleCount = 0;
    private int pennyCount = 0;

    public void add(AbstractMoney item)
    {
        int itemCount = item.getCount();
        store[storeIndex] = item;
        currentValue += item.getValue() * itemCount;
        switch (item.getName())
        {
            case "Dollar":
                dollarCount += itemCount;
                break;
            case "Quarter":
                quarterCount += itemCount;
                break;
            case "Dime":
                dimeCount += itemCount;
                break;
            case "Nickel":
                nickleCount += itemCount;
                break;
            case "Penny":
                pennyCount += itemCount;
        }
        storeIndex++;
    }

    public void printContents()
    {
        for (int i = 1; i < storeIndex; i++)
        {
            System.out.println(store[storeIndex - 1].toString());
        }
    }

    public void printValue()
    {
        System.out.println("The piggy bank holds $" + currentValue);
    }
}
