Be prepared to demonstrate your understanding of this week's concepts by answering questions on the following topics. You might prepare by writing down your own answers before hand.

1. Explain how you took advantage of Java's Object Oriented approach to solve the sprint challenge.
    
    Using the Coin class, I was able to create the correct coins in the correct amounts using the constructor that was built in that class.
    To print the coins to the console, I used the methods created in the Coin class to call the specific data that was needed.
    
2. Explain the three steps needed to run a Java application (using the JDK) including what each step does and how those step correlate to running a JavaScript application.
    
    The first step is to compile the code using the `javac` command in the console. If there are no errors, you continue with the `jar cvfe` command, which creates
    a `jar` file using the code that was just compile. Finally, you use the `java -jar` command to run the program.
    
3. Explain how Java being a strongly typed language affected you solution.
    
    The biggest adjustment for me coming from JS to Java is the need to declare types before assigning a value to your variable. So
    in the CoinController, I assigned the total amount of coins the type `double`, even though I initialized the variable to an `int`. If I
    I didn't type cast the variable, I would have received an incorrect output.
    
4. Can you explain the differences between Abstract Classes and Interfaces including how they are used in your application?
    
    With interfaces, you are using the `implements` keyword, whereas with an abstract class, you are using the `extends` keyword.
    Both are blueprints for other classes to use. You can implment as many interfaces into a new class as you would like, but you can 
    only extend one abstract class when you are creating a new class.