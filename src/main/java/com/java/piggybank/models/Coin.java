
package com.java.piggybank.models;
import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;
        import javax.persistence.Table;

@Entity
@Table(name = "coins") //add our coin table
// THIS IS FOR THE CONTROLLER

public class Coin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //generate an id automatically
    private long coinid;
    private String name;
    private String nameplural;
    private double value;
    private int quantity;

    public Coin(String name, String nameplural, double value, int quantity) {
        this.nameplural = nameplural;
        this.value = value;
        this.quantity = quantity;
        this.name = name;
    }

    public Coin() {
    }

    public long getCoinid() {
        return coinid;
    } // coin id will be added automatically

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } // name

    public String getNameplural() {
        return nameplural;
    }

    public void setNameplural(String nameplural) {
        this.nameplural = nameplural;
    } //nameplural

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    } // value

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    } // quanitiy

    @Override
    public String toString() {
        return "coins{" +
                "coinid=" + coinid +
                ",name=" + name +
                ", nameplural=" + nameplural + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}
//DELETE
//        FROM coins;
//
//        INSERT INTO coins (coinid, name, nameplural, value, quantity)
//        VALUES (1, 'Quarter', 'Quarters', 0.25, 1),
//        (2, 'Dime', 'Dimes', 0.10, 1),
//        (3, 'Dollar', 'Dollars', 1.00, 5),
//        (4, 'Nickel', 'Nickels', 0.05, 3),
//        (5, 'Dime', 'Dimes', 0.10, 7),
//        (6, 'Dollar', 'Dollars', 1.00, 1),
//        (7, 'Penny', 'Pennies', 0.01, 10);