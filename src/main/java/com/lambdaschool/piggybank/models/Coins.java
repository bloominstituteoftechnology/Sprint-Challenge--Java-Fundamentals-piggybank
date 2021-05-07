package com.lambdaschool.piggybank.models;


import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coins {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long coinid;
    private int quantity;
    private double value;
    private String name;
    private String nameplural;

    public long getCoinid() {
        return coinid;
    }

    public void setCoinid(long coinid) {
        this.coinid = coinid;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
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

    public Coins() {
    }

    public Coins(int quantity, double value, String name, String nameplural) {
        this.quantity = quantity;
        this.value = value;
        this.name = name;
        this.nameplural = nameplural;
    }
}
