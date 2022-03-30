package com.example.reactivepostgres.controller;

import com.example.reactivepostgres.model.Person;
import com.example.reactivepostgres.repository.PersonRepository;
import com.example.reactivepostgres.to.PersonTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonRepository repository;

    @GetMapping
    public Flux<Person> getPersons() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Person> getPerson(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @PostMapping
    public Mono<Person> create(@RequestBody PersonTo personTo) {
        Person person = new Person();
        person.setName(person.getName());
        return repository.save(person);
    }

    @PutMapping("/{id}")
    public Mono<Person> update(@RequestBody Person person, @PathVariable Integer id) {
        return repository.findById(id)
                .map(p -> {
                    p.setName(person.getName());
                    return p;
                }).flatMap(p -> repository.save(p));
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Integer id) {
        return repository.deleteById(id);
    }
}
