package com.harrisonbrock.money;

public class CoinFactory {
    public CoinFactory() {
    }

    public static Coin addMoney(String coin, int amount) {
        switch (coin) {
            case "Dollar":
                return new Dollar(amount);
            case "Quarter":
                return new Quarter(amount);
            case "Dime":
                return new Dime(amount);
            case "Nickle":
                return new Nickle(amount);
            case "Penny":
                return new Penny(amount);
            default:
                return null;
        }
    }

    public static Coin addMoney(String coin) {
        switch (coin) {
            case "Dollar":
                return new Dollar();
            case "Quarter":
                return new Quarter();
            case "Dime":
                return new Dime();
            case "Nickle":
                return new Nickle();
            case "Penny":
                return new Penny();
            default:
                return null;
        }
    }

}
