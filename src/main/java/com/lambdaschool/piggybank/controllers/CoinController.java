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
public class CoinController {

    @Autowired
    private CoinRepository coinRepository;

    // http://localhost:2019/coins
    // sanity check

    @GetMapping(value = "/coins", produces = "application/json")
    public ResponseEntity<?> findAllCoins() {
        List<Coin> coins = new ArrayList<>();
        coinRepository.findAll().iterator().forEachRemaining(c -> coins.add(c));

        return new ResponseEntity<>(coins, HttpStatus.OK);
    }

    // http://localhost:2019/total
    // prints to the console the contents of the Piggy bank and the total

    @GetMapping(value = "/total", produces = "application/json")
    public ResponseEntity<?> totalOfCoins() {
        List<Coin> coins = new ArrayList<>();
        coinRepository.findAll().iterator().forEachRemaining(c -> coins.add(c));
        System.out.println(coins);

        double total = 0.00;
        for (Coin c : coins) {
            total += c.getQuantity() * c.getValue();
        }

        System.out.println("The piggy bank holds $" + total);

        return new ResponseEntity<>(total, HttpStatus.OK);
    }
}
