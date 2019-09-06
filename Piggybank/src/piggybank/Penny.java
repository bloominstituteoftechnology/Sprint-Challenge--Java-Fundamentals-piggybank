package piggybank;


public class Penny extends CoinAbstract
{
    public Penny(int amount)
    {
        super(amount);
        
        setName("Penny");
        setValue(0.01);
    }

    public Penny()
    {
        setName("Penny");
        setValue(0.01);
    }
}