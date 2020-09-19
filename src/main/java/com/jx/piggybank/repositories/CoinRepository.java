package com.jx.piggybank.repositories;

import com.jx.piggybank.models.Coin;
import org.springframework.data.repository.CrudRepository;

public interface CoinRepository extends CrudRepository<Coin, Long>
{
}
