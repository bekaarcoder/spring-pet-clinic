package com.springframework.springpetclininc.services;

import com.springframework.springpetclininc.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findByAll();
}
