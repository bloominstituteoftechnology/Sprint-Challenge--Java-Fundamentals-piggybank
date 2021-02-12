package com.lambdaschool.piggybank.controllers;


import com.lambdaschool.piggybank.models.PiggyBank;
import com.lambdaschool.piggybank.repositories.PiggyBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PiggyBankController
{
    private List<PiggyBank> findCoins(List<PiggyBank> piggyBankList, CheckPiggyBank tester)
    {
        List<PiggyBank> coinList = new ArrayList<>();

        for (PiggyBank c : piggyBankList)
        {
            if(tester.test(c))
            {
                coinList.add(c);
            }
        }
        return coinList;
    }

    @Autowired
    PiggyBankRepository pbrepos;

    // http://localhost:2019/total
    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> listTotalCoins()
    {
        List<PiggyBank> coinList = new ArrayList<>();
        pbrepos.findAll().iterator().forEachRemaining(coinList::add);

        // printing to console
        //        1 Quarter
        //        1 Dime
        //        5 Dollars
        //        3 Nickels
        //        7 Dimes
        //        1 Dollar
        //        10 Pennies
        //        The piggy bank holds 7.3
        double total = 0;
        for (PiggyBank c : coinList)
        {
            if (c.getQuantity() <= 1)
            {
                System.out.println(c.getQuantity() + " " + c.getName());
                total = total + c.getQuantity() * c.getValue();
            }

            if (c.getQuantity() > 1)
            {
                System.out.println(c.getQuantity() + " " + c.getNameplural());
                total = total + c.getQuantity() * c.getValue();
            }


        }
        System.out.println("The piggy bank holds " + " " + total);

        // postman shows nothing, list gets printed to console.
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
