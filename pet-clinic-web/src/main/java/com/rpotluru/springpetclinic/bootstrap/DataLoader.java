package com.rpotluru.springpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rpotluru.springpetclinic.model.Owner;
import com.rpotluru.springpetclinic.model.Pet;
import com.rpotluru.springpetclinic.model.PetType;
import com.rpotluru.springpetclinic.model.Vet;
import com.rpotluru.springpetclinic.services.OwnerService;
import com.rpotluru.springpetclinic.services.PetTypeService;
import com.rpotluru.springpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
//	private final PetService petService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {

		PetType dog = new PetType();
		dog.setName("dog");
		PetType savedDog = petTypeService.save(dog);
		System.out.println("Saved PetType:" + savedDog);

		PetType cat = new PetType();
		cat.setName("cat");
		PetType savedCat = petTypeService.save(cat);
		System.out.println("Saved PetType:" + savedCat);

		Owner owner1 = new Owner();
//		owner1.setId(1L);
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("123 Brickerel");
		owner1.setCity("Miami");
		owner1.setTelephone("1231231234");

		Pet mikesPet = new Pet();
		mikesPet.setPetType(savedDog);
		mikesPet.setOwner(owner1);
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setName("Rosco");
		owner1.getPets().add(mikesPet);

		ownerService.save(owner1);

		Owner owner2 = new Owner();
//		owner2.setId(2L);
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("123 Brickerel");
		owner2.setCity("Miami");
		owner2.setTelephone("1231231234");

		Pet fionasCat = new Pet();
		fionasCat.setName("Just Cat");
		fionasCat.setOwner(owner2);
		fionasCat.setBirthDate(LocalDate.now());
		fionasCat.setPetType(savedCat);
		owner2.getPets().add(fionasCat);

		ownerService.save(owner2);

		System.out.println("Loaded Owners .....");
		Vet vet1 = new Vet();
//        vet1.setId(1L);
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vetService.save(vet1);

		Vet vet2 = new Vet();
//        vet2.setId(2L);
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vetService.save(vet2);

		System.out.println("Loaded Vets .....");
		System.out.println("Owners:" + ownerService.findAll());
		System.out.println("Vets:" + vetService.findAll());

	}

}
