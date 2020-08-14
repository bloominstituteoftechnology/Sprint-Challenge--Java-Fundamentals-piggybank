package com.java.piggybank;

import com.java.piggybank.models.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class PiggybankApplication {

    public static void main(String[] args) {
        SpringApplication.run(PiggybankApplication.class, args);
// this is where I call all of the constructors and add them to a list of money with a for loop

        ArrayList<Money> piggyBank = new ArrayList<>();

        piggyBank.add(new Quarter(1));
        piggyBank.add(new Dime(1));
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar(1));
        piggyBank.add(new Penny(10));



        double total = 0; // setting the initial total to 0

        for(Money money: piggyBank){ // looping over the array list to get the money
            total +=money.getValue();
        }
        System.out.println("Your piggy bank has " + (total) + " inside");

        for(Money money : piggyBank) {
            System.out.println(money.getName() + " " + (money.getValue())); // print the name and the value of the coins
        }
    }
}

//DELETE
//        FROM coins;
//
//        INSERT INTO coins (coinid, name, nameplural, value, quantity)
//        VALUES (1, 'Quarter', 'Quarters', 0.25, 1),
//        (2, 'Dime', 'Dimes', 0.10, 1),
//        (3, 'Dollar', 'Dollars', 1.00, 5),
//        (4, 'Nickel', 'Nickels', 0.05, 3),
//        (5, 'Dime', 'Dimes', 0.10, 7),
//        (6, 'Dollar', 'Dollars', 1.00, 1),
//        (7, 'Penny', 'Pennies', 0.01, 10);