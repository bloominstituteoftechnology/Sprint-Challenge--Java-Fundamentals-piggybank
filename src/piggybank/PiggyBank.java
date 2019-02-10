package piggybank;

public class PiggyBank {
  // Money will be an interface class for the types of money
  private HashMap<Money, Integer> money;

  public String add(Money tender) {
    // if money does not already have tender, create a new key for that tender (initialized to 0)
    
    // add its stored amount
    // return tender and its amount added
  }

  private static double getDollars() {
    // if dollars in money, set dollars variable to be that amount
    // else set dollars variable to be 0

    // add coinage into total dollars amount
    // return total dollars
  }

  public String getMoney() {
    return "The piggy bank holds $" + getDollars();
  }
}
