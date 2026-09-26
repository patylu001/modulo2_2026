package com.anahuac.modulo2;
import java.util.Scanner;
public class Ejercicio1 {
    //psvm
    public static void main(String[] args) {
        //Convertir una temperatuva en CElsius A fahrenheit
        //Solicitar una temperatura en grados Celsius por consola (usando Scanner) 
        //y mostrar su equivalente en Fahrenheit F = C * 1.8 + 32
        System.out.println("Ingrese la temperatura en grados Celsius: ");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
        scanner.close();
    }
}
