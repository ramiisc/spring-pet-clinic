package com.rpotluru.springpetclinic.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.rpotluru.springpetclinic.model.Owner;
import com.rpotluru.springpetclinic.repositories.OwnerRepository;
import com.rpotluru.springpetclinic.repositories.PetRepository;
import com.rpotluru.springpetclinic.repositories.PetTypeRepository;

@Service
@Profile("springDataJpa")
public class OwnerServiceImpl implements OwnerService{
	
	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;
	
	public OwnerServiceImpl(OwnerRepository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		super();
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Owner findById(Long id) {
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner object) {
		return ownerRepository.save(object);
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public void delete(Owner object) {
		ownerRepository.delete(object);		
	}

	@Override
	public void deleteById(Long id) {
		ownerRepository.deleteById(id);		
	}

	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}

}
