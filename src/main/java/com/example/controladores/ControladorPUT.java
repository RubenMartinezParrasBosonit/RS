package com.example.controladores;

import com.example.objetos.Persona;
import com.example.objetos.PersonaService;
import com.example.objetos.PersonaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("persona")
public class ControladorPUT {

    @Autowired
    @Qualifier("personas")
    ArrayList<PersonaService> personas;

    @PutMapping("{id}")
    String modificarPersona(@PathVariable int id, @RequestBody Persona persona){
        for(int i = 0; i<personas.size(); i++){
            if(personas.get(i).getId() == id){
                if(persona.getNombre() != null){
                    personas.get(i).setNombre(persona.getNombre());
                }if(persona.getCiudad() != null){
                    personas.get(i).setCiudad(persona.getCiudad());
                }if(persona.getEdad() != null){
                    personas.get(i).setEdad(persona.getEdad());
                }
                return "Persona modificada: " + personas.get(i).toString();
            }
        }
        return "Persona no encontrada";
    }
}
