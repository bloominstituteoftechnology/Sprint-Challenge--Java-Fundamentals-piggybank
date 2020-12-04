package com.lambdaschool.piggybank.repositories;

import com.lambdaschool.piggybank.models.Pig;
import org.springframework.data.repository.CrudRepository;


public interface PigRepository extends CrudRepository<Pig, Long>
{
}
