package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.Coins;
import com.lambdaschool.piggybank.repositories.CoinsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoinsController {
    @Autowired
    CoinsRepository coinrepo;
    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> listAllCoins(){
        List<Coins> myList = new ArrayList<>();
        coinrepo.findAll().iterator().forEachRemaining(myList::add);
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }
}
