package piggybank;

public class Quarter extends CoinAbstract
{
    public Quarter(int amount)
    {
        super(amount);

        setName("Quarter");
        setValue(0.25);
    }

    public Quarter()
    {
        setName("Quarter");
        setValue(0.25);
    }
}