package piggybank;


public class Dime extends CoinAbstract
{
    public Dime(int count)
    {
        super(count);
        faceValue = 0.10;
    }

    public Dime()
    {
        faceValue = 0.10;
    }

    @Override
    public String strValue()
    {
        return count + " Dime";
    }
    @Override
    public String strValuePural()
    {
        if (this.count > 1)
        {
            return count + " Dimes";
        }
        else
        {
            return strValue();
        }
    }
}