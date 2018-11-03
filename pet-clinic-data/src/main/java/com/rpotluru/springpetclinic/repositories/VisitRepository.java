package com.rpotluru.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rpotluru.springpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
