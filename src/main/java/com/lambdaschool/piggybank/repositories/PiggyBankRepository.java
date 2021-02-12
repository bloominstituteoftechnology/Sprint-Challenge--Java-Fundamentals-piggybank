package com.lambdaschool.piggybank.repositories;

import com.lambdaschool.piggybank.models.PiggyBank;
import org.springframework.data.repository.CrudRepository;

public interface PiggyBankRepository extends CrudRepository<PiggyBank, Long>
{
}
