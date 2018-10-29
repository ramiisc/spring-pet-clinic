/**
 * 
 */
package com.rpotluru.springpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rpotluru
 *
 */
public class Vet extends Person {
	
	private Set<Speciality> Specialities = new HashSet<>();

	public Set<Speciality> getSpecialities() {
		return Specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		Specialities = specialities;
	}

	@Override
	public String toString() {
		return "Vet [Specialities=" + Specialities + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + "]";
	}
	
	
	

}
