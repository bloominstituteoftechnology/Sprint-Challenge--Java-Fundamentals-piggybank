package piggybank;


public class Nickel extends CoinAbstract
{
    public Nickel(int amount)
    {
        super(amount);
        
        setName("Nickel");
        setValue(0.05);
    }

    public Nickel()
    {
        setName("Nickel");
        setValue(0.05);
    }
}