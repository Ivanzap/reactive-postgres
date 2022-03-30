package com.example.reactivepostgres.repository;

import com.example.reactivepostgres.model.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PersonRepository extends ReactiveCrudRepository<Person, Integer> {

}
