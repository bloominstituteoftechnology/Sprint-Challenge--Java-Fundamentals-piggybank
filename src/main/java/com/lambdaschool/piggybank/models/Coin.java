package com.lambdaschool.piggybank.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coins")

public class Coins
{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long coinid;

    private String name;
    private String nameplural;
    private double value;
    private int quantity;

    public Coins()
    {
    //defaultconstructorneededforJPA
    }

    public Coins(String name, String nameplural, double value, int quantity)
        {
        this.name = name;
        this.nameplural = nameplural;
        this.value = value;
        this.quantity = quantity;
        }

        public long getCoinid(){return coinid;}

        public String getName(){return name;}
        public void setName(){this.name=name;}

        public String getNameplural(){return nameplural;}
        public void setNameplural(){this.nameplural=nameplural;}

        public double getValue(){return value;}
        public void setValue(){this.value=value;}

        public int getQuantity(){return quantity}
        public void setQuantity(){this.quantity=quantity;}

        @Override
        public String toString()
        {
        return"Coins{" +
        "coinid=" + coinid +
        ",name='" + name + '\'' +
        ",nameplural=" + nameplural + '\'' +
        ",value=" + value +
        ",quantity=" + quantity +
        '}';
        }

}