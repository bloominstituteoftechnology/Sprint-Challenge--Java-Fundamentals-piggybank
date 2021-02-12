package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.Coin;
import com.lambdaschool.piggybank.repositories.CoinRepo;
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

    private List<Coin> findCoins(List<Coin> myList, CheckCoin tester)
    {
        List<Coin> tempList = new ArrayList<>();
        for (Coin e : myList)
        {
            if (tester.test(e))
            {
                tempList.add(e);
            }
        }
        return tempList;
    }



    @Autowired
    CoinRepo bankRepo;

//    http://localhost:2019/total
    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> listAll()
    {
        List<Coin> myList = new ArrayList<>();
        bankRepo.findAll().iterator().forEachRemaining(myList::add);

//        List<Coin> rtnList = findCoins(myList, e -> e.getName());


        //amount single or plural name
        //total about piggy bank holds
        double total = 0;
        for (Coin e : myList)
        {

            total = total + (e.getQuantity() * e.getValue());
        }


//        myList.forEach((e) -> e.getQuantity() > 1 ? e.getQuantity() + " " + e.getName() : e.getQuantity() + " " + e.getNameplural());

          myList.forEach(e -> {
              if (e.getQuantity() > 1) {
                  System.out.println(e.getQuantity() + " " + e.getNameplural());
              } else {
                  System.out.println(e.getQuantity() + " " + e.getName());
              }
          });

        System.out.println("total is:" + total);
        return new ResponseEntity<>(" Piggy bank total is: $" + total, HttpStatus.OK);
    }
}
