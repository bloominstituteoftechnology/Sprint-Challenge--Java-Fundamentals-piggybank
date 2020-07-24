package piggyBank;

public abstract class Money
{
    double value;
    int count = 1;

    public Money(int count)
    {
        this.count = count;
    }

    public double getValue()
    {
        return value;
    }

    public int getCount()
    {
        return count;
    }

    public double totalValue()
    {
        return count * value;
    }

    @Override
    public String toString()
    {

    }
}