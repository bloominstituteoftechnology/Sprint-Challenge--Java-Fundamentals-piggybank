package piggyBank;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Collections
        ArrayList<AbstractMoney> piggyBank = new ArrayList<AbstractMoney>();

        piggyBank.add(new Quarter(10));
        piggyBank.add(new Dime(4));
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickle(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar(1));
        piggyBank.add(new Penny(10));

        System.out.println("\n*** Collection ***");
        for(AbstractMoney m: piggyBank) {
            System.out.println(m);
        }

        double piggyBankSum = 0.0;

        for(AbstractMoney m: piggyBank) {
            piggyBankSum += m.getDouble();
        }

        System.out.println("\nThe piggy bank holds $" + piggyBankSum);
        }
    }

