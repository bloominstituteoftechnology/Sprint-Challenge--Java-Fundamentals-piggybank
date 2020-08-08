package com.java.piggybank.repositories;

import com.java.piggybank.models.coins;
import org.springframework.data.repository.CrudRepository;

public interface PiggyBankRepository extends CrudRepository<coins, Long> {

}
