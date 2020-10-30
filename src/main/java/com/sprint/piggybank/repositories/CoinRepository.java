package com.sprint.piggybank.repositories;

import com.sprint.piggybank.models.Coin;
import org.springframework.data.repository.CrudRepository;

public interface CoinRepository extends CrudRepository<Coin, Long> {


}
