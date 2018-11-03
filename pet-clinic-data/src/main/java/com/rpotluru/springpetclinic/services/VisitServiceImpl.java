package com.rpotluru.springpetclinic.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.rpotluru.springpetclinic.model.Visit;
import com.rpotluru.springpetclinic.repositories.VisitRepository;


@Service
@Profile("springDataJpa")
public class VisitServiceImpl  implements VisitService{

	private final VisitRepository visitRepository;
	
	public VisitServiceImpl(VisitRepository visitRepository) {
		super();
		this.visitRepository = visitRepository;
	}

	@Override
	public Visit findById(Long id) {
		return visitRepository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit object) {
		return visitRepository.save(object);
	}

	@Override
	public Set<Visit> findAll() {
		Set<Visit> visits = new HashSet<>();
		visitRepository.findAll().forEach(visits::add);
		return visits;
		
	}

	@Override
	public void delete(Visit object) {
		visitRepository.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		visitRepository.deleteById(id);
		
	}

}
