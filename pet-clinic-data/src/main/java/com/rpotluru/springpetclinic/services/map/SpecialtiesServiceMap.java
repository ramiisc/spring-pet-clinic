package com.rpotluru.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.rpotluru.springpetclinic.model.Speciality;
import com.rpotluru.springpetclinic.model.Vet;
import com.rpotluru.springpetclinic.services.SpecialtyService;

@Service
public class SpecialtiesServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtyService {
	
	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {
		super.save(object);
		return object;
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}


}
