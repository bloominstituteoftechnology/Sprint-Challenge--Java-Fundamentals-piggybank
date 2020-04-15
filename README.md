# Magical Piggy Bank

A student that completes this project shows that they can:

* Create and manipulate the base Java types which include Boolean, byte, char (including Strings), short, int, long, float, and double
* Craft multiple Java Classes which include comments, constructors, static and instance variables (fields), accessors, public and private methods and instantiate and use Objects of these classes
* Implement and use the String and Date data types
* Understand the reason behind and use of BigDecimals
* Craft and use for loops
* Craft and use Java conditionals, branching, including if-then, if-then-else, and switch statements
* Craft and manipulate ArraysList Collections
* Use and implement abstract classes
* Use and implement Lambda Expressions

## Introduction

This sprint challenge combines the knowledge from this week's Java Fundamentals lessons in order to create a Magical Piggy Bank using Java and the JDK.

## Instructions

We have a magical "piggy bank" (a piggy bank is the traditional name of a place to store coins, bills, money). The piggy bank is magical because it can hold unlimited amounts of money. However, you can not get the money out of it.

* [ ] Create a collection (Array, ArrayList, or HashMap) to represent the piggy bank. The elements in the collection are pockets of money.
  * Each element in the collection contains
    * The number of coins in this group
    * The face value of the coins in the group
    * How to print the total value of this group which is face value * number of coins in group
  * The elements in the collection should be an abstract class of money. The abstract class of money should have child classes for each of the following types of money
    * A Dollar worth $1.00
    * A Quarter worth $0.25
    * A Dime worth $0.10
    * A Nickel worth $0.05
    * A Penny worth $0.01
  * When creating a money object, you can optionally give the number of coins being added. If no number is given, the default is 1 coin being added to the piggy bank.  

The main program will look something like this pseudocode (remember pseudocode is not meant to be syntactically correct but explain the algorithm):

* [ ] Create collection
* [ ] piggyBank.add(new Quarter())
* [ ] piggyBank.add(new Dime())
* [ ] piggyBank.add(new Dollar(5))
* [ ] piggyBank.add(new Nickel(3))
* [ ] piggyBank.add(new Dime(7))
* [ ] piggyBank.add(new Dollar())
* [ ] piggyBank.add(new Penny(10))
* [ ] Print the contents of the Piggy Bank
  * on the console should appear  

    `1 Quarter`  
    `1 Dime`  
    `$5`  
    `3 Nickels`  
    `7 Dimes`  
    `$1`  
    `10 Pennies`  

- [ ] Print the value of the Piggy Bank
  - on the console should appear  

    `The piggy bank holds $7.30`  

Note: that when you have more than 1 coin, the plural of the coins name is printed.

## Stretch Goals

* [ ] Add the ability to remove coins from the piggy bank
  * Prevent taking more coins than present in the piggy bank
  * Coins do not have to be removed in the same quantity that were added. For example based on the main program above, removing 3 dimes would be allowed. The Piggy Bank should adjust appropriately.
  * Just the amount to be removed should be given. The program will figure out which coins to remove.

Pseudocode for this should look like

* [ ] subtract(1.50)
* [ ] print contents of the Piggy Bank
  * on the console on possible out come is  

    `$4`  
    `7 Dimes`  
    `$1`  
    `10 Pennies`  
