package piggybank;

public class Dollar extends CoinAbstract
{
    public Dollar(int count)
    {
        super(count);
        faceValue = 1.0;
    }

    public Dollar()
    {
        faceValue = 1.0;
    }

    @Override
    public String strValue()
    {
        return "$" + count;
    }

    @Override
    public String strValuePural()
    {
        return strValue();
    }
}