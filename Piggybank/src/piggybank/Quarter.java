package piggybank;

public class Quarter extends CoinAbstract
{
    public Quarter(int count)
    {
        super(count);
        faceValue = 0.25;
    }

    public Quarter()
    {
        faceValue = 0.25;
    }

    @Override
    public String strValue()
    {
        return count + " Quarter";
    }

    @Override
    public String strValuePural()
    {
        if (this.count > 1)
        {
            return count + " Quarters";
        }
        else
        {
            return strValue();
        }
    }
}