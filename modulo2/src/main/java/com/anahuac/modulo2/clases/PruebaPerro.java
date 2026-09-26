package com.anahuac.modulo2.clases;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaPerro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Perro> listaPerros = new ArrayList<Perro>();
        
        Perro miPerro = new Perro("Neron", "Paty", "Shar pei");
        

        listaPerros.add(miPerro);

        int salir = 0;
        while(salir!= -1){
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Agregar nuevo perro");
            System.out.println("-1. Salir");
            System.out.print("Selecciona una opción: ");

         
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpieza de búfer

            switch (opcion) {
                case 1:
                    System.out.print("Ingresar nombre del perro: ");
                    String nombrePerro = scanner.nextLine();
                    System.out.print("Ingresar nombre del dueño: ");
                    String nombreDuenio = scanner.nextLine();
                    System.out.print("Ingresar raza: ");
                    String raza = scanner.nextLine();
                    Perro nuevoPerro = new Perro(nombrePerro, nombreDuenio, raza);
                    listaPerros.add(nuevoPerro);
                    break;
                case -1:
                    salir = opcion;
            }
        }

        for(Perro p: listaPerros){
            System.out.println("Nombre del perro: " + p.getNombre());
            System.out.println("Nombre del dueño: " + p.getNombreDuenio());
            System.out.println("Raza: " + p.getRaza());
        }
        
    }
}
