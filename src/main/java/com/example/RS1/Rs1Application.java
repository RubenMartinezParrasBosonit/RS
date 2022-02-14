package com.example.RS1;

import com.example.objetos.PersonaService;
import com.example.objetos.PersonaServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication(scanBasePackages = {"com.example.controladores"})
public class Rs1Application {

	public static void main(String[] args) {
		SpringApplication.run(Rs1Application.class, args);
	}

	@Bean(name = "personas")
	ArrayList<PersonaService> personas(){
		ArrayList<PersonaService> personas = new ArrayList<>();
		PersonaService p = new PersonaServiceImp();
		p.setId(1);
		p.setNombre("Rubén");
		p.setCiudad("Torredonjimeno");
		p.setEdad("25");
		personas.add(p);
		return personas;
	}

}
