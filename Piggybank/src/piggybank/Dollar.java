package piggybank;

public class Dollar extends CoinAbstract
{
    public Dollar(int amount)
    {
        super(amount);

        setName("Dollar");
        setValue(1.00);
    }


    public Dollar()
    {
        setName("Dollar");
        setValue(1.00);
    }
}