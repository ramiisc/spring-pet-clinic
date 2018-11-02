/**
 * 
 */
package com.rpotluru.springpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author rpotluru
 *
 */

@Entity
@Table(name="vets")
public class Vet extends Person {
	
	@ManyToMany
	@JoinTable(name="vet_specialties", joinColumns=@JoinColumn(name="vet_id"),
	inverseJoinColumns=@JoinColumn(name="speciality_id"))
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
