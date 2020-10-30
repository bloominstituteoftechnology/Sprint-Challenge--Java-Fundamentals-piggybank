package com.lambdaschool.piggybank.repositories;

import com.lambdaschool.piggybank.models.Pig;
import org.springframework.data.repository.CrudRepository;

/**
 * Connects the rest of the Java application to the Pig table
 */
public interface PigRepository extends CrudRepository<Pig, Long>
{
}