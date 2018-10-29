package com.rpotluru.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.rpotluru.springpetclinic.model.Specialty;
import com.rpotluru.springpetclinic.model.Vet;
import com.rpotluru.springpetclinic.services.SpecialtiesService;

@Service
public class SpecialtiesServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtiesService {
	
	@Override
	public Set<Specialty> findAll() {
		return super.findAll();
	}

	@Override
	public Specialty findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Specialty save(Specialty object) {
		super.save(object);
		return object;
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Specialty object) {
		super.delete(object);
	}


}
