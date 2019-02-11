package piggybank;

// Should this be abstract or should its children classes just extend it?
// Let's see if I have a reason for an abstract method.
public abstract class Money {
  private String name;
  private int amount;

  @Override
  public String toString() {
    return amount + " " + name;
  }
}