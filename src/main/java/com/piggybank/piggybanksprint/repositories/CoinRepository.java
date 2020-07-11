package com.piggybank.piggybanksprint.repositories;

import com.piggybank.piggybanksprint.models.Coin;
import org.springframework.data.repository.CrudRepository;

public interface CoinRepository extends CrudRepository<Coin, Long> {


}
