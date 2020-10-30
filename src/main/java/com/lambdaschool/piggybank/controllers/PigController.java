package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.PiggybankApplication;
import com.lambdaschool.piggybank.repositories.PigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.lambdaschool.piggybank.models.Pig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PigController
{

    @Autowired
    PigRepository pigrepos;

    @GetMapping(value = "/total",
        produces = {"application/json"})
    public ResponseEntity<?> getAllCoins()
    {
        List<Pig> myList = new ArrayList<>();
        pigrepos.findAll()
            .iterator()
            .forEachRemaining(myList::add);

        myList.sort((c1, c2) -> c1.getName()
            .compareToIgnoreCase(c2.getName()));

        return new ResponseEntity<>(myList,
            HttpStatus.OK);

        long total = 0;

        for (Pig c : myList)
        {
            total = total + c.getQuantity();
        }

        System.out.println("The Piggy Bank holds" + total);
    }
}