package guru.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;

	}

	@Override
	public void run(String... args) throws Exception {
		
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		dog.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);

		Owner owner1 = new Owner();
		owner1.setFirstName("Mark");
		owner1.setLastName("Plier");		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Muy");
		owner2.setLastName("Skerm");
		ownerService.save(owner2);

		Owner owner3 = new Owner();
		owner3.setFirstName("Jack");
		owner3.setLastName("Septiceye");
		ownerService.save(owner3);
		
		Owner owner4 = new Owner();
		owner4.setFirstName("Lord");
		owner4.setLastName("Minion777");
		ownerService.save(owner4);
		
		System.out.println("Added owner");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Cream");
		vet1.setLastName("Hero");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Ari");
		vet2.setLastName("Rirang");
		vetService.save(vet2);		

		System.out.println("Added vet");
	}

}
