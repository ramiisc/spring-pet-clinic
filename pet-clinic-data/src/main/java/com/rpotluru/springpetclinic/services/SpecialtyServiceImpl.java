package com.rpotluru.springpetclinic.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.rpotluru.springpetclinic.model.Speciality;
import com.rpotluru.springpetclinic.repositories.SpecialityRepository;

@Service
@Profile("springDataJpa")
public class SpecialtyServiceImpl implements SpecialtyService {

	private final SpecialityRepository specialtyRepository;
	
	
	public SpecialtyServiceImpl(SpecialityRepository specialtyRepository) {
		super();
		this.specialtyRepository = specialtyRepository;
	}

	@Override
	public Speciality findById(Long id) {
		return specialtyRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality object) {
		return specialtyRepository.save(object);	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialities = new HashSet<>();
		specialtyRepository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public void delete(Speciality object) {
		specialtyRepository.delete(object);		
	}

	@Override
	public void deleteById(Long id) {
		specialtyRepository.deleteById(id);
		
	}

}
