package com.example.controladores;

import com.example.objetos.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;

@RestController
@RequestMapping("persona")
public class ControladorDELETE {

    @Autowired
    @Qualifier("personas")
    ArrayList<PersonaService> personas;

    @DeleteMapping("{id}")
    public String borrarPersona(@PathVariable int id){
        Iterator<PersonaService> it = personas.iterator();
        while(it.hasNext()){
            PersonaService p = it.next();
            if(p.getId()==id){
                it.remove();
                return "Persona con id: " + p.getId() + " borrada";
            }
        }
        return "Persona no encontrada";
    }
}
