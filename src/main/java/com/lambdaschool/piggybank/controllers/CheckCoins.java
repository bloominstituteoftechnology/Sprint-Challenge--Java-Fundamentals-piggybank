package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.Coin;

@FunctionalInterface
public interface CheckCoins
{
    boolean test(Coin coin);  //checks to see if an item is truthy
}
