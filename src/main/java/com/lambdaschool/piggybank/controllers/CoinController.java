package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.Coin;
import com.lambdaschool.piggybank.repositories.CoinRepo;
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

//    http://localhost:2019/total   Lists current total within piggy bank
    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> listAll()
    {
        List<Coin> myList = new ArrayList<>();
        bankRepo.findAll().iterator().forEachRemaining(myList::add);


        //amount single or plural name
        //total about piggy bank holds
        double total = 0;
        for (Coin e : myList)
        {

            total = total + (e.getQuantity() * e.getValue());
        }

          myList.forEach(e -> {
              if (e.getQuantity() > 1) {
                  System.out.println(Math.round(e.getQuantity()) + " " + e.getNameplural());
              } else {
                  System.out.println(Math.round(e.getQuantity()) + " " + e.getName());
              }
          });

        System.out.println("Piggy bank total is: $" + total);
        return new ResponseEntity<>(" Piggy bank total is: $" + total, HttpStatus.OK);
    }

//    http://localhost:2019/money/{amount}
    @GetMapping(value = "/money/{amount}", produces = {"application/json"})
    public ResponseEntity<?> listMoneyRemove(@PathVariable double amount)
    {
        List<Coin> myList = new ArrayList<>();
        bankRepo.findAll().iterator().forEachRemaining(myList::add);

//        myList.forEach((e -> {
//            if (e.getQuantity() > amount ) {
//                if ( e.getValue() == 1.00) {
//                    System.out.println("$" + (e.getQuantity() * e.getValue() - amount * e.getValue()));
//                } else {
//                    if (e.getQuantity() - amount == 1) {
//                        System.out.println(Math.round(((e.getQuantity() * e.getValue() - amount * e.getValue())) / e.getValue()) + " " + e.getName());
//                    } else {
//                        System.out.println(Math.round(((e.getQuantity() * e.getValue() - amount * e.getValue())) / e.getValue()) + " " + e.getNameplural());
//                    }
//                }
//            } else {
//                System.out.println("Money not available");
//            }
//        }
//        ));
// This function removes a coin from each object depending on the parameter given. If coins aren't available, doesn't remove.
        double total = 0;
        for (Coin e : myList)
        {
            if (e.getQuantity() >= amount ) {
                if ( e.getValue() == 1.00) {
                    System.out.println("$" + Math.round((e.getQuantity() * e.getValue() - amount * e.getValue())));
                    total = total + (e.getQuantity() * e.getValue() - amount * e.getValue());
//                    System.out.println(total);
                } else {
                    if (e.getQuantity() - amount <= 1) {
                        System.out.println(Math.round(((e.getQuantity() * e.getValue() - amount * e.getValue())) / e.getValue()) + " " + e.getName());
                        total = total + (e.getQuantity() * e.getValue() - amount * e.getValue());
//                        System.out.println(total);
                    } else {
                        System.out.println(Math.round(((e.getQuantity() * e.getValue() - amount * e.getValue())) / e.getValue()) + " " + e.getNameplural());
                        total = total + (e.getQuantity() * e.getValue() - amount * e.getValue());
//                        System.out.println(total);
                    }
                }
            } else {
                System.out.println("Money not available");
            }

//            total = total + (e.getQuantity() * e.getValue());
        }
//
        System.out.println("The piggy bank holds: $" + (Math.round(total * 100.0) / 100.0));

        return new ResponseEntity<>("The piggy bank holds: $" + (Math.round(total * 100.0) / 100.0), HttpStatus.OK);
    }
}
