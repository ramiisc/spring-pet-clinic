/**
 * 
 */
package com.rpotluru.springpetclinic.model;

import java.util.Set;

/**
 * @author rpotluru
 *
 */
public class Vet extends Person {
	
	private Set<Specialty> Specialties;

	public Set<Specialty> getSpecialties() {
		return Specialties;
	}

	public void setSpecialties(Set<Specialty> specialties) {
		Specialties = specialties;
	}
	
	
	

}
