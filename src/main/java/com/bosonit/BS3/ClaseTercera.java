package com.bosonit.BS3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;

@Service
public class ClaseTercera implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Soy la tercera clase" + " soy " + args[0] + " y vivo en "+ args[1]);
    }
}
