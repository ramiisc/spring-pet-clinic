package com.rpotluru.springpetclinic.services.map;

import java.util.Set;

import com.rpotluru.springpetclinic.model.Pet;
import com.rpotluru.springpetclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
	
	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		super.save(object.getId(), object);
		return object;
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		;
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
		;
	}


}
