package com.example.ejercico.services;
import com.example.ejercico.repositories.*;

import com.example.ejercico.models.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service  
public class AnimalService {
   @Autowired  
   AnimalRepository AnimalRepo; 


   public ArrayList<animal> todoLosAnimales(){
       
        return (ArrayList<animal>) AnimalRepo.findAll();
   }

   public String guardar(animal animal){
    AnimalRepo.save(animal);
       return "guardado correctamente";
   }
   public Optional <animal> buscarPorId(Long id){
      return AnimalRepo.findById(id);
 
    }
    
   
   

}