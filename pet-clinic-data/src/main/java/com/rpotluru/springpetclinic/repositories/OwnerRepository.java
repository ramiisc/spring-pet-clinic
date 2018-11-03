package com.rpotluru.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rpotluru.springpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
