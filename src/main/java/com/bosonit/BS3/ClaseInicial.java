package com.bosonit.BS3;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ClaseInicial {
    @PostConstruct
    public void saludo() {
        System.out.println( "Hola desde clase inicial");
    }

}
