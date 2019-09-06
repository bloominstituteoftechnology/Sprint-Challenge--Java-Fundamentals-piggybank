package piggybank;

public abstract class CoinAbstract
{
    private String name;
    private double value;
    private int amount;

    public CoinAbstract()
    {
        this.amount = 1;
    }

    public CoinAbstract(int amount)
    {
        this.amount = amount;
    }

    public double getTotal() {
        return this.value * this.amount;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getAmount() {
        if (this.amount > 1 )
        {
            return this.amount + " " + this.name + "s";
        }
        else
        {
            return this.amount + " " + this.name;
        }
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}