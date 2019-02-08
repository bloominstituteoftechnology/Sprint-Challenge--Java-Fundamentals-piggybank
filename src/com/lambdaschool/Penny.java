package com.lambdaschool;

public class Penny extends Specie
{

    public Penny()
    {
        super(1, .01, "Penny");
    }

    public Penny(int number)
    {
        super(number, .01, "Penny");
    }

}
