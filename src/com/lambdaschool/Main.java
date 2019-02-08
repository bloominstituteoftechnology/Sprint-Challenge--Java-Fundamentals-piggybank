package com.lambdaschool;

public class Main {

    public static void main(String[] args) {
        piggyBank oinky = new piggyBank();
        oinky.getBalance();
        oinky.depositCash("quarter", 1);
        oinky.getBalance();
        oinky.depositCash("dime", 1);
        oinky.getBalance();
        oinky.depositCash("dollar", 5);
        oinky.getBalance();
        oinky.depositCash("dime", 7);
        oinky.getBalance();
        oinky.depositCash("nickel", 3);
        oinky.getBalance();
        oinky.depositCash("dollar", 1);
        oinky.getBalance();
        oinky.depositCash("penny", 10);
        oinky.getBalance();
    }
}
