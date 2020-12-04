package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.Pig;

import java.util.ArrayList;
import java.util.List;

public class HelperFunctions
{
    public static List<Pig> findCoins(List<Pig> fullList, CheckPiggy tester)
    {
        List<Pig> tempPig = new ArrayList<>();

        for (Pig c : fullList)
        {
            if (tester.test(c))
            {
                tempPig.add(c);
            }
        }

        return tempPig;
    }
}
