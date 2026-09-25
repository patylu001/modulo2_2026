package com.anahuac.modulo2.cadenas;

public class EjemploCadenas {
 //Escribir psvm
    public static void main(String[] args) {
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        String cadena3 = "Hola Mundo";
        String cadena4 = "hola mundo";

        //Concatenar cadenas
        String resultado = cadena1 + " " + cadena2;
        System.out.println("Resultado de la concatenación: " + resultado);

        //Comparar cadenas
        boolean sonIguales = cadena3.equals(cadena4);
        System.out.println("¿Las cadenas son iguales? " + sonIguales);

        //Convertir a mayúsculas y minúsculas
        String mayusculas = cadena1.toUpperCase();
        String minusculas = cadena2.toLowerCase();
        System.out.println("Cadena en mayúsculas: " + mayusculas);
        System.out.println("Cadena en minúsculas: " + minusculas);

        //Obtener la longitud de una cadena
        int longitud = cadena3.length();
        System.out.println("Longitud de la cadena: " + longitud);

        //Reemplazar caracteres en una cadena
        String reemplazo = cadena3.replace("Mundo", "Java");
        System.out.println("Cadena después del reemplazo: " + reemplazo);

        //Extraer una subcadena
        String subcadena = cadena3.substring(5, 10);
        System.out.println("Subcadena extraída: " + subcadena);
    }
}
