package guru.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {

		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Mark");
		owner1.setLastName("Plier");		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Muy");
		owner2.setLastName("Skerm");
		ownerService.save(owner2);

		Owner owner3 = new Owner();
		owner3.setId(3L);
		owner3.setFirstName("Jack");
		owner3.setLastName("Septiceye");
		ownerService.save(owner3);
		
		Owner owner4 = new Owner();
		owner4.setId(4L);
		owner4.setFirstName("Lord");
		owner4.setLastName("Minion777");
		ownerService.save(owner4);
		
		System.out.println("Added owner");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Cream");
		vet1.setLastName("Hero");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Ari");
		vet2.setLastName("Rirang");
		vetService.save(vet2);		

		System.out.println("Added vet");
	}

}
