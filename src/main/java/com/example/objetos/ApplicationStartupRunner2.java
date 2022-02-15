package com.example.objetos;

import org.springframework.boot.CommandLineRunner;

public class ApplicationStartupRunner2 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Soy la tercera clase");
        for (int i = 0; i< args.length;i++){
            System.out.println(args[i]);
        }
    }
}
