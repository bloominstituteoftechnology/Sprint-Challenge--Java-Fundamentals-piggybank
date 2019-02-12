package piggybank;

public class Dollar extends Money {
  private static String name = "Dollar";
  private static double value = 1.00;

  public Dollar() {
    super(name, value);
  }

  public Dollar(int amount) {
    super(name, value, amount);
  }

  @Override
  public String toString() {
    return "$" + super.getDollarString();
  }
}
