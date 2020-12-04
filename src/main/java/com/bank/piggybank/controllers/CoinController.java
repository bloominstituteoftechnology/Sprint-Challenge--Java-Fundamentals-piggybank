package com.bank.piggybank.controllers;

import com.bank.piggybank.models.Coin;
import com.bank.piggybank.repository.CoinRepository;
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
    //STEP 1.
    //@Autowired
    // WE NEED TO CREATE A REPOSITORY
    // CREATE AN OBJECT OF THE REPOSITORY WHEN WE FIRST RUN THE CLASS
    // CREATE AN OBJECT OF THE REPOSITORY
    @Autowired
    CoinRepository coinrepos;

    private List<Coin> findCoins(List<Coin> myList, CheckCoin tester)
    {
        List<Coin> tempList = new ArrayList<>();
        for(Coin c : myList)
        {
            if(tester.test(c))
            {
                tempList.add(c);
            }
        }

        return tempList;
    }

    //http://localhost:2019/coins/all
    // Creating the endpoint

    @GetMapping(value="/coins/all", produces = "application/json")
    public ResponseEntity<?> listAllCoins()
    {
        List<Coin> myList = new ArrayList<>();
        coinrepos.findAll().iterator().forEachRemaining(myList::add);
        myList.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

    //http://localhost:2019/total
    @GetMapping(value="/total", produces = "application/json")
    public ResponseEntity<?> listTotal()
    {
        List<Coin> myList = new ArrayList<>();
        coinrepos.findAll().iterator().forEachRemaining(myList::add);

        myList.forEach(c ->{
            if(c.getQuantity() > 1){
                System.out.println(c.getQuantity() + " " + c.getNameplural());
            } else {
                System.out.println(c.getQuantity() + " " + c.getName());
            }
    });
        double total = 0.0;

        for(Coin c : myList){
            total = total + c.getQuantity() * c.getValue();
        }
        System.out.println("The Total Value is: " + total);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
