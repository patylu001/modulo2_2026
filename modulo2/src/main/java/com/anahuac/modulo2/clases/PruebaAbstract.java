package com.anahuac.modulo2.clases;

public class PruebaAbstract {
 
    public static void main(String[] args) {
        // No se puede instanciar directamente la clase abstracta Animal
        //Animal animal = new Animal("Animal"); // Esto generará un error de compilación

        // Se puede instanciar una subclase concreta de Animal
        Perrito perrito = new Perrito("Fido");
        perrito.hacerSonido(); // Llamada al método abstracto implementado en la subclase
        perrito.dormir(); // Llamada al método concreto heredado de la clase abstracta
    }
}
