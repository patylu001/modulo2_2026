package com.anahuac.modulo2.estructuras.mapas;

import java.util.HashMap;
import java.util.Map;

public class EjercicioHashMap {
    public static void main(String[] args) {
        // Creating a HashMap object
        HashMap<String, Integer> students = new HashMap<>();
 
        String texto = "hola     como estas?";
        System.out.println(texto+": "+"bien");
        
        // Adding key-value pairs (student name and age) to the HashMap
        students.put("Alice", 20);
        students.put("Bob", 22);
        students.put("Charlie", 19);
        students.put("Charlie1", 19);
        students.put("Charlie2", 19);
        students.put("Charlie3", 19);
        students.put("Nuevo", 18);
        
        /*
        Función
        f(x) = x + 2 + 2x
        f(0) = 2
        f(2) = 8 
        */

        // Retrieving a value by its key
        Integer aliceAge = students.get("Alice");

        System.out.println("Alice's age: " + aliceAge);
        System.out.println("--------------------");
        // Checking if a key is present in the HashMap
        boolean containsKey = students.containsKey("David");
        System.out.println("Is David in the HashMap? " + containsKey);
        System.out.println("--------------------");
        System.out.println("Tamaño antes de remover a Bob: " + students.size());
       // Removing a key-value pair by its key
        students.remove("Bob");
        
        System.out.println("Tamaño DESPUES de remover a Bob: " + students.size());
        System.out.println("--------------------");
        // Iterating over the HashMap using a for-each loop and entrySet
        System.out.println("Iterating over the HashMap:");
        
        
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(name + ": " + age);
        }
        
        System.out.println("----- Iterating over the HashMap:  KEYSET----- ");
        //Iterar usando las llaves
        for (String llave : students.keySet()) {
            System.out.println(llave);
            System.out.println("Edad: " + students.get(llave));
        }
        
        System.out.println("----- Encontrar elementos con edad 19----- ");
        //for (i = 0 ; i < 10; i++)
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            if (age == 19)
            	System.out.println(name + ": " + age);
        }
        
    }
}
