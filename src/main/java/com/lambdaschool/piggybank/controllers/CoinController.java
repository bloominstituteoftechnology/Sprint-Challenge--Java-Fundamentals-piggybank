package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.Coin;
import com.lambdaschool.piggybank.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

        //    coins (coinid, name, nameplural, value, quantity)
        for (Coin c : coinList) {
            if (c.getQuantity() > 1 ){
                
            }
        }



        return new ResponseEntity<>(coinList, HttpStatus.OK);
    }

}
