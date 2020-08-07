package com.piggybank.piggybank.repositories;

import org.springframework.data.repository.CrudRepository;
import com.piggybank.piggybank.models.Coin;

public interface CoinRepository extends CrudRepository<Coin, Integer> {
}
