package com.rpotluru.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rpotluru.springpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
