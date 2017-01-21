package com.theironyard.services;


import com.theironyard.entities.Mastermind;
import org.springframework.data.repository.CrudRepository;

public interface MastermindRepository extends CrudRepository<Mastermind, Integer> {
}
