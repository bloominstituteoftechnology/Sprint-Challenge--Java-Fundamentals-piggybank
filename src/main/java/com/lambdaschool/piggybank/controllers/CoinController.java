package com.lambdaschool.piggybank.controllers;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.lambdaschool.piggybank.models.Coin;
import com.lambdaschool.piggybank.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoinController
{
    @Autowired
    public CoinRepository coinRepository;

//    endpoint and what results are needed
//    http://localhost:2019/total
//
//    1 Quarter
//    1 Dime
//    5 Dollars
//    3 Nickels
//    7 Dimes
//    1 Dollar
//    10 Pennies
//    The piggy bank holds 7.3

    @GetMapping(value = "/total", produces = "application/json")
    public ResponseEntity<?> getTotal()
    {
       List<Coin> coinList = new ArrayList<>();
        coinRepository.findAll().iterator().forEachRemaining(coinList::add);

        double total = 0;
        for (Coin c : coinList)
            {
            total += (double)(c.getQuantity()* c.getValue());
            if(c.getQuantity()>1)
            {
                System.out.println(c.getNameplural() + " " + c.getQuantity());
            }
            else {
                System.out.println(c.getName() + " " + c.getQuantity());
            }
            }
        System.out.println("The piggy bank holds " + total);
        return new ResponseEntity<>(total,HttpStatus.OK);
    }

    //not using this function in the challenge
    private List<Coin> filteredCoins(List<Coin> coinList, CheckCoins tester)
    {
        List<Coin> rtnList = new ArrayList<>();

        for (Coin c: coinList) {
            if (tester.test(c)) {
                rtnList.add(c);
            }
        }
        return rtnList;
    }

}
