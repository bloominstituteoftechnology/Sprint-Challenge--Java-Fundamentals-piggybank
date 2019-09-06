package piggybank;


public class Dime extends CoinAbstract
{
    public Dime(int amount)
    {
        super(amount);
        
        setName("Dime");
        setValue(0.10);
    }

    public Dime()
    {
        setName("Dime");
        setValue(0.10);
    }
}