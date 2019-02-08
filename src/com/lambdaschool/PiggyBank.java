package com.lambdaschool;

import java.util.ArrayList;

public class PiggyBank
{
    private ArrayList<Specie> storage = new ArrayList<>();
    private double totalValue;

    public void add(Specie newMoney)
    {
        totalValue += newMoney.getTotalValue();
        storage.add(newMoney);
    }

    public void printContents()
    {
        for (Specie s: storage
             )
        {
            System.out.println(s.getNumber() + " " + s.getName());
        }
    }

    public double getValue()
    {
        return totalValue;
    }
}
