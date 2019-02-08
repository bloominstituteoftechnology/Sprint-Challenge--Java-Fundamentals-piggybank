package piggyBank;

public class Dime extends AbstractMoney{
    public static final String name = "Dime";

    public Dime(int money) {
        super(money);
    }

    public String getName() {
        return name;
    }

    public double getDouble() {
        return (double)money * .1;
    }
}
