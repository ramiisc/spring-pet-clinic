package com.rpotluru.springpetclinic.services;

import com.rpotluru.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);
}
