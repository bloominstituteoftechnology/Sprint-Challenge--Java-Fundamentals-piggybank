package com.lambdaschool;

public class piggyBank {
    private double balance = 0;

    public double getBalance() {
        System.out.println("*Piggy has been smashed. This is now blood money.*");
        System.out.println(balance);
        return balance;
    }

    public void depositCash(String currency, int amount) {
        switch(currency) {
            case "dollar":
                balance += (1.00 * amount);
                break;
            case "quarter":
                balance += (0.25 * amount);
                break;
            case "dime":
                balance += (0.10 * amount);
                break;
            case "nickel":
                balance += (0.05 * amount);
                break;
            case "penny":
                balance += (0.01 * amount);
                break;
            default:
                balance =+ (0.00);
                System.out.println("Fall on hard times? You didn't put any money in.");
        }
    }
}
