package com.example.ejercico.controllers;
import java.util.ArrayList;
import java.util.Optional;

import com.example.ejercico.models.animal;
import com.example.ejercico.services.AnimalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/animal") 
public class AnimalController {
    @Autowired
    AnimalService animalesService;

       
    @GetMapping()
    public ArrayList<animal> obtenerAnimales(){
        return animalesService.todoLosAnimales();
    }

    @PostMapping()
    public String guardar(@RequestBody animal animal){
        return animalesService.guardar(animal);
    }
    @PostMapping("/{id}")
    public Optional<animal> obtenerid(long id){
        return animalesService.buscarPorId(id);
    }

    



    
}