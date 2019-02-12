package piggybank;

public class Dime extends Money {
  private static String name = "Dime";
  private static double value = 0.10;

  public Dime() {
    super(name, value);
  }

  public Dime(int amount) {
    super(name, value, amount);
  }
}
