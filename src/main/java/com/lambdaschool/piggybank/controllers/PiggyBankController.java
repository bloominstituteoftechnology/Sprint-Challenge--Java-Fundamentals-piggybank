package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.Coins;
import com.lambdaschool.piggybank.repositories.PiggyBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public
class PiggyBankController
{
    @Autowired
    PiggyBankRepository pigrepos;

    private List<Coins> FindCoins(List<Coins> myList, CheckPiggyBank tester)
    {
        List<Coins> tempList = new ArrayList<>();

        for (Coins c : myList) { if (tester.test(c)) { tempList.add(c); } }

        return tempList;
    }


    //http://localhost:2021/total
    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> listAllCoins()
    {
        List<Coins> myList = new ArrayList<>();
        pigrepos.findAll()
                .iterator()
                .forEachRemaining(myList::add);
        double total = 0;
        for(Coins c : myList)
        {
            total = total + c.getQuantity();
        }

        System.out.println("Total Amount" + total);
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }






}




























