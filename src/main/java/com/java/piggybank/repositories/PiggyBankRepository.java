package com.java.piggybank.repositories;

import com.java.piggybank.models.Coin;
import org.springframework.data.repository.CrudRepository;

public interface PiggyBankRepository extends CrudRepository<Coin, Long> {

}
// this repository goes with coin
