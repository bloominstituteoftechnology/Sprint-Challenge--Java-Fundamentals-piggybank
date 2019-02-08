package piggyBank;

public abstract class AbstractMoney {
    int money;
    double total = 0;

    public AbstractMoney (int money) {
        this.money = money;

    }

    public abstract String getName();
    public abstract double getDouble();


    public String toString() {
        return getName() == "Dollar" ? "$" + money : money + " " + getName();
    }
}