package com.rpotluru.springpetclinic.services.map;

import java.util.Set;

import com.rpotluru.springpetclinic.model.Vet;
import com.rpotluru.springpetclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
	
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		super.save(object.getId(), object);
		return object;
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		;
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
		;
	}


}
