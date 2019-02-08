package piggyBank;

public class Dollar extends AbstractMoney{
    public static final String name = "Dollar";

    public Dollar(int money) {
        super(money);
    }

    public String getName() {
        return name;
    }

    public double getDouble() {
        return (double)money;
    }
}
