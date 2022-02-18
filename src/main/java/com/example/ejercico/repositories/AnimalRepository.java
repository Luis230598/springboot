package com.example.ejercico.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.ejercico.models.animal;

@Repository
public interface AnimalRepository extends CrudRepository<animal,Long> {

    
}
