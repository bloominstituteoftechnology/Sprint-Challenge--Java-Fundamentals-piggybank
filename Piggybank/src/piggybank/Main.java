package piggybank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main
{
    public static ArrayList<CoinAbstract> piggyBank = new ArrayList<CoinAbstract>();

    public static boolean checkSpend(double spending)
    {
        ArrayList<CoinAbstract> checking = new ArrayList<CoinAbstract>();

        for (CoinAbstract m : piggyBank)
        {
            if (m instanceof Nickel)
            {
                checking.add(new Nickel(m.getCount()));
            }
            if (m instanceof Penny)
            {
                checking.add(new Penny(m.getCount()));
            }
            if (m instanceof Quarter)
            {
                checking.add(new Quarter(m.getCount()));
            }
            if (m instanceof Dime)
            {
                checking.add(new Dime(m.getCount()));
            }
            if (m instanceof Dollar)
            {
                checking.add(new Dollar(m.getCount()));
            }
        }

        for (CoinAbstract m : checking)
        {
            double workingAmt = Math.round((spending / m.getFaceValue()) * 100.0) / 100.0;
            int need = (int) (workingAmt);

            if (need >= m.getCount())
            {
                need = m.getCount();
            }

            m.setCount(m.getCount() - need);

            spending = spending - (need * m.getFaceValue());
            spending = Math.round(spending * 100.0) / 100.0;

            if (spending <= 0)
            {
                return true;
            }
        }
        return false;
    }

    public static void spend(double spending)
    {
        for (CoinAbstract m : piggyBank)
        {
            double workingAmt = Math.round((spending / m.getFaceValue()) * 100.0) / 100.0;
            int need = (int) (workingAmt);

            if (need >= m.getCount())
            {
                need = m.getCount();
            }

            m.setCount(m.getCount() - need);

            spending = spending - (need * m.getFaceValue());
            spending = Math.round(spending * 100.0) / 100.0;

            if (spending <= 0)
            {
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        System.out.println("*** Inside the piggy bank is\n");
        piggyBank.forEach(p -> System.out.println(p.strValuePural()));

        double myValue = 0.0;
        for (CoinAbstract m : piggyBank)
        {
            myValue = myValue + m.getValue();
        }



        System.out.println("The piggy bank holds " + fp.format(myValue));

        System.out.println();
        System.out.println("This is The Stretch\n");

        double amtToSpend = 1.50;
        if (checkSpend(amtToSpend))
        {
            spend(amtToSpend);
            myValue = 0.0;
            System.out.println("*** Inside the piggy bank is\n");
            for (CoinAbstract m : piggyBank)
            {
                if (m.getCount() > 0)
                {
                    System.out.println(m.strValuePural());
                    myValue = myValue + m.getValue();
                }
            }

            System.out.println("The piggy bank holds " + fp.format(myValue));
        } else
        {
            System.out.println("Insufficient Funds Your Broke :-(");
        }
    }
}