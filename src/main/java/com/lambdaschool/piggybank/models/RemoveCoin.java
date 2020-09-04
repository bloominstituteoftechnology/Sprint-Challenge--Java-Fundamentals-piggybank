package com.lambdaschool.piggybank.models;

import javax.persistence.*;

@Entity
@Table(name = "removecoin")
public class RemoveCoin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private double removeCoin;

    public RemoveCoin() {
    }

    public RemoveCoin(double removeCoin) {
        this.removeCoin = removeCoin;
    }

    public double getRemoveCoin() {
        return removeCoin;
    }

    public void setRemoveCoin(double removeCoin) {
        this.removeCoin = removeCoin;
    }
}
