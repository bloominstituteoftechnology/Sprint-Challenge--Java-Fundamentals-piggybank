package piggyBank;

public abstract class AbstractMoney {
    int money;

    public AbstractMoney (int money) {
        this.money = money;

    }

    public abstract String getName();

    public String toString() {
        return getName() == "Dollar" ? "$" + money : money + " " + getName();
    }
}