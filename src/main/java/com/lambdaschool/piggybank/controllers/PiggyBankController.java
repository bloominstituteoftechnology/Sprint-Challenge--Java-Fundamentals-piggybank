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
public class PiggyBankController {
    @Autowired
    private CoinRepository coinRepository;
    @GetMapping(value="/coins/all", produces="application/json")
    public ResponseEntity<?> findAllCoins() {
         double total = 0;
        List<Coin> coins = new ArrayList<>();
        coinRepository.findAll().iterator().forEachRemaining((coins::add));
        for(Coin c:coins) {
           total += c.getValue() * c.getQuantity();
           System.out.println(c.getQuantity() + " " + c.getName() );


        }
        System.out.println("The Piggy Bank Holds " + total);
        return new ResponseEntity<>(null,  HttpStatus.OK);
    }

}
