package piggybank;

import java.text.DecimalFormat;

// Should this be abstract or should its children classes just extend it?
// Let's see if I have a reason for an abstract method.
public class Money {
  static DecimalFormat decimal = new DecimalFormat("##");

  private String name;
  private double value;
  private int amount;

  public Money(String name, double value) {
    this.name = name;
    this.value = value;
    amount = 1;
  }

  public Money(String name, double value, int amount) {
    this.name = name;
    this.value = value;
    this.amount = amount;
  }

  public String getName() {
    return name;
  }

  public double getValue() {
    return value;
  }

  public int getAmount() {
    return amount;
  }

  public double getDollarAmount() {
    return value * amount;
  }

  public String getDollarString() {
    return decimal.format(value * amount);
  }

  @Override
  public String toString() {
    return amount + " " + name;
  }
}
