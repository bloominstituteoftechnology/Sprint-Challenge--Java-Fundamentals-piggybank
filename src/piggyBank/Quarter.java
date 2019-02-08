package piggyBank;

public class Quarter extends AbstractMoney{
    public static final String name = "Quarter";

    public Quarter(int money) {
        super(money);
    }

    public String getName() {
        return name;
    }

    public double getDouble() {
        return (double)money * .25;
    }

}
