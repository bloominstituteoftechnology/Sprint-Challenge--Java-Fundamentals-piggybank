package com.lambdaschool.piggybank.repositories;

import com.lambdaschool.piggybank.models.Piggybank;
import org.springframework.data.repository.CrudRepository;

public interface PiggyRepo extends CrudRepository<Piggybank, Long>
{
// http://localhost:2019/total
}
