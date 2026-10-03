package com.anahuac.modulo2.clases;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método concreto (con implementación)
    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    // Método abstracto (sin cuerpo, obligado a implementar en hijos)
    public abstract void hacerSonido();
} 
    

