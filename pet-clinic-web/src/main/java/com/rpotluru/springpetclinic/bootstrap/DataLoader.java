package com.rpotluru.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rpotluru.springpetclinic.model.Owner;
import com.rpotluru.springpetclinic.model.Vet;
import com.rpotluru.springpetclinic.services.OwnerService;
import com.rpotluru.springpetclinic.services.PetService;
import com.rpotluru.springpetclinic.services.VetService;
import com.rpotluru.springpetclinic.services.map.OwnerServiceMap;
import com.rpotluru.springpetclinic.services.map.PetServiceMap;
import com.rpotluru.springpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final PetService petService;
	private final VetService vetService;

	public DataLoader() {
		ownerService = new OwnerServiceMap();
		petService = new PetServiceMap();
		vetService = new VetServiceMap();
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		
		Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        
        System.out.println("Loaded Owners .....");
        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        
        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        
        System.out.println("Loaded Vets .....");

	}

}
