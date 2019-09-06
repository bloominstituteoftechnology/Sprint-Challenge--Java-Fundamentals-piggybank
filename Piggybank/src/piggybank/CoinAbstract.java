package piggybank;

import java.math.BigDecimal;

public abstract class CoinAbstract
{
    protected int count = 1;
    protected double faceValue;

    public CoinAbstract(int count)
    {
        this.count = count;
    }

    public CoinAbstract()
    {

    }

    public double getValue()
    {
        return faceValue * count;
    }

    public double getFaceValue()
    {
        return faceValue;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public abstract String strValue();

    public abstract String strValuePural();
}