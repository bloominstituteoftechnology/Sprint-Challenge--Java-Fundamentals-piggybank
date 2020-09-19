package com.jx.piggybank.controllers;

import com.jx.piggybank.models.Coin;
import com.jx.piggybank.repositories.CoinRepository;
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
    // Create coin repository instance
    @Autowired
    private CoinRepository _repository;

    // GET: /total
    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> getBankTotal()
    {
        List<Coin> coinList = new ArrayList<>();
        double total = 0.00f;
        _repository.findAll().iterator().forEachRemaining(coinList::add);

        for(Coin c: coinList)
        {
            if (c.getQuantity() == 1)
            {
                System.out.println("1 " + c.getName());
            } else
            {
                System.out.println(c.getQuantity() + " " + c.getNameplural());
            }

            total = total + (c.getQuantity() * c.getValue());
        }

        System.out.println("The piggy bank holds $" + String.format("%.2f",total));
        return new ResponseEntity(HttpStatus.OK);
    }
}
