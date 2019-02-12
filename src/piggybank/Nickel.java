package piggybank;

public class Nickel extends Money {
  private static String name = "Nickel";
  private static double value = 0.05;

  public Nickel() {
    super(name, value);
  }

  public Nickel(int amount) {
    super(name, value, amount);
  }
}
