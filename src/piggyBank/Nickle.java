package piggyBank;

public class Nickle extends AbstractMoney{
    public static final String name = "Nickle";

    public Nickle(int money) {
        super(money);
    }

    public String getName() {
        return name;
    }

    public double getDouble() {
        return (double)money * .05;
    }
}
