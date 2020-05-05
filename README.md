# WEB Java Fundamentals Sprint Challenge

**Read these instructions carefully. Understand exactly what is expected _before_ starting this Sprint Challenge.**

This challenge allows you to practice the concepts and techniques learned over the past sprint and apply them in a concrete project. This sprint explored **Java Fundamentals**. During this sprint, you studied **Java Fundamentals using the JDK**. In your challenge this week, you will demonstrate your mastery of these skills by creating **a Java Console Application using Object Oriented Programming**.

This is an individual assessment. All work must be your own. Your challenge score is a measure of your ability to work independently using the material covered through this sprint. You need to demonstrate proficiency in the concepts and objectives introduced and practiced in preceding days.

You are not allowed to collaborate during the sprint challenge. However, you are encouraged to follow the twenty-minute rule and seek support from your TL if you need direction.

_You have **three hours** to complete this challenge. Plan your time accordingly._

## Introduction

This sprint challenge combines the knowledge from this week's Java Fundamentals lessons to create a Magical Piggy Bank using Java and the JDK. We have a magical "piggy bank" (a piggy bank is the traditional name of a place to store coins, bills, money). The piggy bank is magical because it can hold unlimited amounts of money. However, you can not get the money out of it.

The use of IntelliJ is optional. However, I think using a text editor with the JDK as we did the first three modules would be more straightforward for this challenge.

### Commits

Commit your code regularly and meaningfully. This helps both you (in case you ever need to return to old code for any number of reasons) and your team lead as the evaluate your solution.

## Interview Questions

Be prepared to demonstrate your understanding of this week's concepts by answering questions on the following topics. You might prepare by writing down your own answers before hand.

1. Describe why Java is called an object oriented, strongly typed language.
2. Give examples of Java Collections explaining the use and differences between them.
3. What is recursion and how does it differ from regular looping?
4. Explain the differences between Abstract Classes and Interfaces including scenarios of when to use them.

## Instructions

### Task 1: Project Set Up

- [ ] Create a forked copy of this project
- [ ] Add your team lead as collaborator on Github
- [ ] Clone your OWN version of the repository (Not Lambda's by mistake!)
- [ ] Create a new branch: git checkout -b `<firstName-lastName>`.
- [ ] Create the proper directory structure for developing a Java Application
- [ ] Push commits: `git push origin <firstName-lastName>`
- [ ] Implement the project on your newly created `<firstName-lastName>` branch, committing changes regularly
- [ ] Push commits: git push origin `<firstName-lastName>`

### Task 2: Project Requirements

- [ ] Create a collection (Array, ArrayList, or HashMap) to represent the piggy bank. The elements in the collection are pockets of money.
  - Each element in the collection contains
    - The number of coins in this group
    - The face value of the coins in the group
    - How to print the total value of this group which is face value * number of coins in the group
  - The elements in the collection should be an abstract class of money. The abstract class of money should have child classes for each of the following types of money
    - A Dollar worth $1.00
    - A Quarter worth $0.25
    - A Dime worth $0.10
    - A Nickel worth $0.05
    - A Penny worth $0.01
  - When creating a money object, you can optionally give the number of coins being added. If no number is given, the default is 1 coin being added to the piggy bank.  

The main program will look something like this pseudocode (remember pseudocode is not meant to be syntactically correct but explain the algorithm):

- [ ] Create collection
- [ ] piggyBank.add(new Quarter())
- [ ] piggyBank.add(new Dime())
- [ ] piggyBank.add(new Dollar(5))
- [ ] piggyBank.add(new Nickel(3))
- [ ] piggyBank.add(new Dime(7))
- [ ] piggyBank.add(new Dollar())
- [ ] piggyBank.add(new Penny(10))
- [ ] Print the contents of the Piggy Bank
  - on the console should appear  
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

Note: that when you have more than 1 coin, the plural of the coin's name is printed.

### Required best practices

- [ ] Consistent naming. Examples: variables, functions, Components, and file/folder organization.
- [ ] Consistent spacing. Examples: line breaks, around arguments and before/after functions.
- [ ] Consistent quotation usage.
- [ ] Spell-check.
- [ ] Schedule time to review, refine and reassess your work.

It is better to submit a challenge that meets [MVP](https://en.wikipedia.org/wiki/Minimum_viable_product) than one that attempts too much and fails.

### Tips and Gotchas

In your solution, it is essential that you follow best practices and produce clean and professional results. You will be scored on your adherence to proper code style and good organization. Schedule time to review, refine, and assess your work and perform basic professional polishing including spell-checking and grammar-checking on your work. It is better to submit a challenge that meets MVP than one that attempts too much and does not.

### Task 3: Stretch Goals

After finishing your required elements, you can push your work further. These goals may or may not be things you have learned in this module but they build on the material you just studied. Time allowing, stretch your limits and see if you can deliver on the following optional goals:

- [ ] Add the ability to remove coins from the piggy bank
  - Prevent taking more coins than present in the piggy bank
  - Coins do not have to be removed in the same quantity that were added. For example based on the main program above, removing 3 dimes would be allowed. The Piggy Bank should adjust appropriately.
  - Just the amount to be removed should be given. The program will figure out which coins to remove.

Pseudocode for this should look like

- [ ] subtract(1.50)
- [ ] print contents of the Piggy Bank
  - on the console on possible out come is  
    `$4`  
    `7 Dimes`  
    `$1`  
    `10 Pennies`  
- [ ] Print the value of the Piggy Bank
  - on the console should appear  

    `The piggy bank holds $4.30`

## Submission format

Follow these steps for completing your project.

- [ ] Submit a Pull-Request to merge <firstName-lastName> Branch into master (student's  Repo). **Please don't merge your own pull request**
- [ ] Add your team lead as a reviewer on the pull-request
- [ ] Your team lead will count the project as complete after receiving your pull-request
