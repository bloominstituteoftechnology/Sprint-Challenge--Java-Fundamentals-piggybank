package piggyBank;

import java.text.DecimalFormat;
import java.util.*;

public class Main
{
    public static void printMoney(ArrayList<AbstractMoney> money, CheckMoney tester)
    {

    }
    DecimalFormat fp = new DecimalFormat("$###,###.00");

    Dollar dollar = new Dollar(1.00);
    Quarter quarter = new Quarter(0.25);
    Dime dime = new Dime(0.10);
    Nickel nickel = new Nickel(0.05);
    Penny penny = new Penny(0.01);

    System.out.println("The piggy bank holds " + fp.format(myValue));
}