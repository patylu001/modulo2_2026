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
       //public Perro(){}

     public Perro(String nombre, String nombreDuenio, String raza) {
        this.nombre = nombre;
        this.nombreDuenio = nombreDuenio;
        this.raza = raza;
        
    } 
   
    
    
  public Perro(double peso, String raza, int edad, char genero, String nombre, String nombreDuenio,
            HashMap<String, LocalDate> cartillaVacunacion) {
        this.peso = peso;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
        this.nombreDuenio = nombreDuenio;
        this.cartillaVacunacion = cartillaVacunacion;
    }



  public Perro(String nombre) {
        this.nombre = nombre;
    }



  public void otroPerro(String nombre, String nombreDuenio, String raza) {
        this.nombre = nombre;
        this.nombreDuenio = nombreDuenio;
        this.raza = raza;
        
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }
    public void setCartillaVacunacion(HashMap<String, LocalDate> cartillaVacunacion) {
        this.cartillaVacunacion = cartillaVacunacion;
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
