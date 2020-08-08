package com.java.piggybank.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coins")

public class coins {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long coinid;
    private String nameplural;
    private double value;
    private int quantity;

    public coins(String nameplural, double value, int quantity) {
        this.nameplural = nameplural;
        this.value = value;
        this.quantity = quantity;
    }

    public coins() {
    }

    public long getCoinid() {
        return coinid;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "coins{" +
                "coinid=" + coinid +
                ", nameplural='" + nameplural + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}
