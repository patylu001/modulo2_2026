package com.anahuac.modulo2.clases;


public class Perrito extends Animal {
    public Perrito(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
} 