package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.Coins;
import com.lambdaschool.piggybank.repositories.CoinsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CoinsController {
    @Autowired
    CoinsRepository coinsRepository;

    @GetMapping(value = "/total", produces = "application/json")
    public ResponseEntity<?> printContents()
    {

        List<Coins> coinsList = new ArrayList<>();
        coinsRepository.findAll().iterator().forEachRemaining((c) -> coinsList.add(c));

        double total = 0;
        for (Coins c : coinsList)
        {
            total += c.getQuantity() * c.getValue();
        }

        System.out.println("The Piggy Bank holds $" + total);

        return new ResponseEntity<>(coinsList, HttpStatus.OK);

    }


}
