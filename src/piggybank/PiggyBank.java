package piggybank;

import java.util.HashMap;

public class PiggyBank {
  // Money will be an interface class for the types of money
  private HashMap<String, Integer> money = new HashMap<>();

  public String add(Money tender) {
    String name = tender.getName();
    if (!money.containsKey(name)) {
      money.put(name, 0);
    }
    
    money.put(name, money.get(name) + tender.getAmount());
    return tender.toString();
  }

  private static double getDollars() {
    // if dollars in money, set dollars variable to be that amount
    // else set dollars variable to be 0

    // add coinage into total dollars amount
    // return total dollars
    return 0;
  }

  public String getMoney() {
    return "The piggy bank holds $" + getDollars();
  }
}
