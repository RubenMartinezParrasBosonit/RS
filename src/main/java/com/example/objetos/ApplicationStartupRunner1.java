package com.example.objetos;

import org.springframework.boot.CommandLineRunner;

public class ApplicationStartupRunner1 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola desde clase secundaria");
    }
}
