package piggyBank;

public class Penny extends AbstractMoney {
    public static final String name = "Penny";

    public Penny(int money) {
        super(money);
    }

    public String getName() {
        return name;
    }

    public double getDouble() {
        return (double)money * .01;
    }
}
