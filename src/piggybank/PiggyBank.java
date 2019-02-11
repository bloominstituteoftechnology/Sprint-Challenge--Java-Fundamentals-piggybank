package piggybank;

public class PiggyBank {
  // Money will be an interface class for the types of money
  private HashMap<String, Integer> money = new HashMap<>();

  public String add(Money tender) {
    if (!money.containsKey(tender.name)) {
      money.put(tender.name, 0);
    }
    
    money.put(tender.name, tender.amount);
    return tender.toString();
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
