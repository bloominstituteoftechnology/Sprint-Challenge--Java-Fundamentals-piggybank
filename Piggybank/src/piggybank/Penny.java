package piggybank;


public class Penny extends CoinAbstract
{
    public Penny(int count)
    {
        super(count);
        faceValue = 0.01;
    }

    public Penny()
    {
        faceValue = 0.01;
    }

    @Override
    public String strValue()
    {
        return count + " Penny";
    }

    @Override
    public String strValuePural()
    {
        if (this.count > 1)
        {
            return count + " Pennies";
        }
        else
        {
            return strValue();
        }
    }
}