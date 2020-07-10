package com.lambdaschool.piggybank.models;

import javax.persistence.*;

@Entity
@Table(name="piggybank")

public class Piggybank
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long coinid;
    String name;
    String namepural;
    Long value;
    Long quantity;

    public Piggybank(String name, String namepural, Long value, Long quantity)
    {
        this.name = name;
        this.namepural = namepural;
        this.value = value;
        this.quantity = quantity;
    }

    public Piggybank()
    {

    }

    public Long getCoinid() {
        return coinid;
    }

    public void setCoinid(Long coinid) {
        this.coinid = coinid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamepural() {
        return namepural;
    }

    public void setNamepural(String namepural) {
        this.namepural = namepural;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Piggybank{" +
                "coinid=" + coinid +
                ", name='" + name + '\'' +
                ", namepural='" + namepural + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}
