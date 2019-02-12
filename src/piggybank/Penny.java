package piggybank;

public class Penny extends Money {
  private static String name = "Penny";
  private static double value = 0.01;

  public Penny() {
    super(name, value);
  }

  public Penny(int amount) {
    super(name, value, amount);
  }
}
