package piggybank;

public class Quarter extends Money {
  private static String name = "Quarter";
  private static double value = 0.25;

  public Quarter() {
    super(name, value);
  }

  public Quarter(int amount) {
    super(name, value, amount);
  }
}
