package com.rpotluru.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rpotluru.springpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
