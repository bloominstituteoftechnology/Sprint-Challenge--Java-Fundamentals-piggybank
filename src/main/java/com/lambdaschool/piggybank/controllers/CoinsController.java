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

    private List<Coins> findTotalPrint(List<Coins>myList, CheckCoins tester){
        List<Coins> temptList = new ArrayList<>();

        for(Coins e: myList){
            if(tester.test(e));{
                temptList.add(e);
            }
        }

        return temptList;
    }

    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> listAllCoins(){
        List<Coins> myList = new ArrayList<>();
        coinrepo.findAll().iterator().forEachRemaining(myList::add);
        myList.forEach(a ->{
            if(a.getQuantity()> 1){
                System.out.println(a.getQuantity() + " " + a.getNameplural());
            }else{
                System.out.println(a.getQuantity()+ " " + a.getName());
            }
        } );
        double totalPiggyBank=0;

        for(Coins e: myList){
            totalPiggyBank=  totalPiggyBank + (e.getQuantity())*(e.getValue());

        }
        System.out.println( "The pippy bank holds" + " " + totalPiggyBank);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/amount", produces = {"application/json"})
    public ResponseEntity<?> removeAmount(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
