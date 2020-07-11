package com.piggybank.piggybanksprint.controllers;

import com.piggybank.piggybanksprint.models.Coin;

import java.util.List;

import com.piggybank.piggybanksprint.repositories.CoinRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@RestController
public class CoinController {
    @Autowired
    CoinRepository coinrepos;


    @GetMapping(value = "/total",
        produces = {"application/json"})
        public ResponseEntity<?> listAllCoins() {
        List<Coin> coinList = new ArrayList<>();
        coinrepos.findAll().iterator().forEachRemaining((coinList::add));

        coinList.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
        return new ResponseEntity<>(coinList, HttpStatus.OK);
    }
}
