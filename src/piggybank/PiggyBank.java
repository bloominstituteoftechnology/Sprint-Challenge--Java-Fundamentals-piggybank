package piggybank;

import java.text.DecimalFormat;
import java.util.HashMap;

public class PiggyBank {
  static DecimalFormat decimal = new DecimalFormat("##.00");
  // Money will be an interface class for the types of money
  private HashMap<String, Integer> money = new HashMap<>();
  private double total = 0;

  public void add(Money tender) {
    String name = tender.getName();

    if (!money.containsKey(name)) {
      money.put(name, 0);
    }
    
    money.put(name, money.get(name) + tender.getAmount());
    total += tender.getDollarAmount();

    System.out.println(tender.toString());
  }

  public String getMoney() {
    return "The piggy bank holds $" + decimal.format(total);
  }
}
