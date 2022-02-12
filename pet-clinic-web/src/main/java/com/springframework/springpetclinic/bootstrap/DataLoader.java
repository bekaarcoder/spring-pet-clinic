package com.springframework.springpetclinic.bootstrap;

import com.springframework.springpetclininc.model.Owner;
import com.springframework.springpetclininc.model.Vet;
import com.springframework.springpetclininc.services.OwnerService;
import com.springframework.springpetclininc.services.VetService;
import com.springframework.springpetclininc.services.map.OwnerServiceMap;
import com.springframework.springpetclininc.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("John");
        owner1.setLastName("Doe");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Jane");
        owner2.setLastName("Doe");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("James");
        vet1.setLastName("Webb");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jim");
        vet2.setLastName("Paul");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
