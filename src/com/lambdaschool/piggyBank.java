public class PiggyBank
{
    private int myPennies;
    private int myNickels;
    private int myDimes;
    private int myQuarters;

    public PiggyBank()
    {
        int Pennies;
        int Nickels;
        int Dimes;
        int Quarters
    }

    public PiggyBank(int Pennies, int Nickels, int Dimes, int Quarters)
    {
        myPennies = Pennies;
        myNickels = Nickels;
        myDimes = Dimes;
        myQuarters = Quarters;
    }

    public int getPennies(PiggyBank temp)
    {
        return temp.myPennies;
    }

    public int getNIckels(PiggyBank temp)
    {
        return temp.myNIckels;
    }

    public int getDimes(PiggyBank temp)
    {
        return temp.myDimes;
    }

    public int getQuarters(PiggyBank temp)
    {
        return temp.myQuarters;
    }

    public void addCoind(int Pennies, int Nickels, int Dimes, int Quarters)
    {
        myPennies += Pennies;
        myNickels += Nickels;
        myDimes += Dimes;
        myQuarters += Quarters;
    }

    public double total ()
    {
        double total = 0;
        total += myPennies*.01;
        total += myNickels*.01;
        total += myDimes*.01;
        total += myQuarters*.01;

    }

    public string toString()
    {
        return (myPennies+ " pennies, " + myNickels + " nickels, " + myDimes + " dimes, and " + myQuarters + " quarters.\n");
    }
}