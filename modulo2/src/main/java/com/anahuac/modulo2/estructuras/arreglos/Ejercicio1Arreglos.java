package com.anahuac.modulo2.estructuras.arreglos;

public class Ejercicio1Arreglos {
	
	    public static void main(String[] args)   
	    {  
	        int[] numbers={10,20,30,40,50}; // Arreglo de enteros
	        
	        int num1 = 10;
	        int num2 = 20;
	        int num3 = 30;
	        int num4 = 40;
	        int num5 = 50;
	        
	          
	        System.out.println("Element at index 0: " + numbers[0] + " esta es otra frase	");  
	        System.out.println("Element at index 2: " + numbers[2]);  
	        System.out.println("Element at index 4: " + numbers[4]);  

			int[] numeros = new int[3];
			
			System.out.println("Element at index 0: " + numeros[0]);  
	        System.out.println("Element at index 1: " + numeros[1]);  
	        System.out.println("Element at index 2: " + numeros[2]); 

			numeros[0] = 100;

			numeros[1] = 200;

			numeros[2] = numeros[0] + numeros[1];

			System.out.println("Element at index 0: " + numeros[0]);  
	        System.out.println("Element at index 1: " + numeros[1]);  
	        System.out.println("Element at index 2: " + numeros[2]);

			int MAX = 10000000;
			int[] otros = new int[MAX];

			numeros[1] = -1;
	    }
	          
}
