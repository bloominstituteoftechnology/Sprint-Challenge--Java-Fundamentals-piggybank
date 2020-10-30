package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.Pig;

import java.util.ArrayList;
import java.util.List;

public class AssistingFunctions
{
    public static List<Pig> findCountries(List<Pig> fullList, CheckPig tester)
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
