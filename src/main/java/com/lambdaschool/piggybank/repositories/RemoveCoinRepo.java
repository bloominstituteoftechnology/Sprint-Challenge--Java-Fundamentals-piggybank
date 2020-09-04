package com.lambdaschool.piggybank.repositories;

import com.lambdaschool.piggybank.models.RemoveCoin;
import org.springframework.data.repository.CrudRepository;

public interface RemoveCoinRepo extends CrudRepository<Long, RemoveCoin> {
}
