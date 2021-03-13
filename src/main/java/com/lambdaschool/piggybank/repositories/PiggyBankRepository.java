package com.lambdaschool.piggybank.repositories;

import com.lambdaschool.piggybank.models.Coins;
import org.springframework.data.repository.CrudRepository;

public interface PiggyBankRepository extends CrudRepository<Coins, Long>
{
}