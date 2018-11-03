package com.rpotluru.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.rpotluru.springpetclinic.model.Visit;
import com.rpotluru.springpetclinic.services.VisitService;

@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

	@Override
	public Set<Visit> findAll() {
		return super.findAll();
	}

	@Override
	public Visit findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Visit save(Visit object) {
		super.save(object);
		return object;
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		;
	}

	@Override
	public void delete(Visit object) {
		super.delete(object);
		;
	}

}
