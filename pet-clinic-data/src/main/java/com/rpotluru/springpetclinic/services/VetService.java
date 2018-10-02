package com.rpotluru.springpetclinic.services;

import java.util.Set;

import com.rpotluru.springpetclinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();

}
