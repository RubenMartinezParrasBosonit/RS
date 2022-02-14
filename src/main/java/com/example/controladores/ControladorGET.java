package com.example.controladores;

import com.example.objetos.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("persona")
public class ControladorGET {


    @Autowired
    @Qualifier("personas")
    ArrayList<PersonaService> personas;


    @GetMapping("{id}")
    public String getPersonaId(@PathVariable int id){
        for(PersonaService p : personas){
            if(p.getId() == id){
                return p.toString();
            }
        }
        return "No encontrado";
    }

    @GetMapping("nombre/{nombre}")
    public String getPersonaNombre(@PathVariable String nombre){
        String resultado = "";
        boolean alguien = false;
        for(PersonaService p : personas){
            if(p.getNombre().equals(nombre)){
                resultado+= p.toString() + " ";
                alguien = true;
            }
        }
        if(alguien){
            return resultado;
        }else{
            return "No encontrado";
        }
    }

}
