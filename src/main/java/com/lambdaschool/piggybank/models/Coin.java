package com.lambdaschool.piggybank.models;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin
{
    //how the Table looks in SQL
//    coins (coinid, name, nameplural, value, quantity)
//    VALUES (1, 'Quarter', 'Quarters', 0.25, 1),
//                  (2, 'Dime', 'Dimes', 0.10, 1),
//                      (3, 'Dollar', 'Dollars', 1.00, 5),
//                      (4, 'Nickel', 'Nickels', 0.05, 3),
//                      (5, 'Dime', 'Dimes', 0.10, 7),
//                      (6, 'Dollar', 'Dollars', 1.00, 1),
//                      (7, 'Penny', 'Pennies', 0.01, 10);
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long coinid;
    private String name;
    private String nameplural;
    private double value;
    private int quantity;

    public Coin()
    {
    }

    public Coin(
        String name,
        String nameplural,
        double value,
        int quantity)
    {
        this.name = name;
        this.nameplural = nameplural;
        this.value = value;
        this.quantity = quantity;
    }

    public long getCoinid()
    {
        return coinid;
    }

    public void setCoinid(long coinid)
    {
        this.coinid = coinid;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNameplural()
    {
        return nameplural;
    }

    public void setNameplural(String nameplural)
    {
        this.nameplural = nameplural;
    }

    public double getValue()
    {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}

