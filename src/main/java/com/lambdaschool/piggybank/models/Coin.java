package com.lambdaschool.piggybank.models;


import javax.persistence.*;

@Entity
@Table(name= "coins")
public class Coin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long coinid;
    private String name;
    private String nameplural;
    private double value;
    private long quantity;
    
    public Coin() {

    }

    public long getCoinid() {
        return coinid;
    }

    public void setCoinid(long coinid) {
        this.coinid = coinid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameplural() {
        return nameplural;
    }

    public void setNameplural(String nameplural) {
        this.nameplural = nameplural;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
       if(this.quantity == 1) {
           return (this.quantity  + " " + this.name) ;
       }
       else{
           return this.quantity + " " + this.nameplural;
       }

    }
}
