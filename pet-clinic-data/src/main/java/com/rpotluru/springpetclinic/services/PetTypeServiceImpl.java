package com.rpotluru.springpetclinic.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.rpotluru.springpetclinic.model.PetType;
import com.rpotluru.springpetclinic.repositories.PetTypeRepository;

@Service
@Profile("springDataJpa")
public class PetTypeServiceImpl implements PetTypeService {

	private final PetTypeRepository petTypeRepository;

	public PetTypeServiceImpl(PetTypeRepository petTypeRepository) {
		super();
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public PetType findById(Long id) {
		return petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType object) {
		return petTypeRepository.save(object);
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> petTypes = new HashSet<>();
		petTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public void delete(PetType object) {
		petTypeRepository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		petTypeRepository.deleteById(id);

	}

}
