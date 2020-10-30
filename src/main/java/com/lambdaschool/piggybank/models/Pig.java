//Create a model Coin to represent the table for the piggy bank
//    Each row in the table contains: (use the provided data.sql as a guide)
//    The number of coins in this group
//    The face value of the coins in the group
//    The name of a single coin
//    The name of more than one coin

//coins (coinid, name, nameplural, value, quantity)

package com.lambdaschool.piggybank.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "coins")
public class Pig
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long coinid;

    private String name;
    private String nameplural;
    private long value;
    private int quantity;

    public Pig(String name,
               String nameplural,
               long value,
               int quantity)
    {
        this.name = name;
        this.nameplural = nameplural;
        this.value = value;
        this.quantity = quantity;
    }

    public Pig()
    {
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

    public void setNameplural()
    {
        this.nameplural = nameplural;
    }

    public long getValue()
    {
        return value;
    }

    public void setValue(long value)
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
