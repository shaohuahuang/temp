package com.dbs.myapp.dao;

import com.dbs.myapp.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
}
