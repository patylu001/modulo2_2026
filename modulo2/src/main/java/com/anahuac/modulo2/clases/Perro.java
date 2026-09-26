package com.anahuac.modulo2.clases;

import java.time.LocalDate;
import java.util.HashMap;

public class Perro {
    //Atributos
    private double peso;
    private String raza;
    private int edad;
    private char genero;
    private String nombre;
    private String nombreDuenio;
    private HashMap<String, LocalDate> cartillaVacunacion = new HashMap<>();

    //Constructor

    public Perro(String nombre, String nombreDuenio, String raza) {
        this.nombre = nombre;
        this.nombreDuenio = nombreDuenio;
        this.raza = raza;
        
    }
    

    //Métodos
    public double getPeso() {
        return peso;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public HashMap<String, LocalDate> getCartillaVacunacion() {
        return cartillaVacunacion;
    }

    //Métodos
    public void comer(){
        System.out.println("Estoy comiendo");
    }

    public void dormir(){
        System.out.println("Estoy durmiendo");
    }

    public double caminar(){
        int distancia = 100;
        for(int i = 0; i< 10; i++){
            distancia +=i;
            System.out.println("Estoy caminando");
        }
        return distancia;
    }

    public void vacunar(String nombreVacuna){
         LocalDate today = LocalDate.now();
         cartillaVacunacion.put(nombreVacuna, today);        
    }


}
