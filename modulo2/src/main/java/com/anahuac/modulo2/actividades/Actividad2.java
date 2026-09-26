package com.anahuac.modulo2.actividades;

import java.util.Scanner;

public class  Actividad2{
//GestorTareasTemplate
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO 1: Declarar e inicializar un ArrayList de tipo String llamado 'listaTareas'
        // ArrayList<String> listaTareas = ...
        
        // TODO 2: Declarar e inicializar un HashMap con Integer (ID) y String (Descripción) llamado 'mapaTareas'
        // HashMap<Integer, String> mapaTareas = ...

        int contadorID = 1; // Contador para generar IDs automáticos en el HashMap
        boolean salir = false;

        System.out.println("=== BIENVENIDO AL GESTOR DE TAREAS ===");

        while (!salir) {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Agregar tarea (en ArrayList y HashMap)");
            System.out.println("2. Ver todas las tareas");
            System.out.println("3. Eliminar tarea por ID (desde HashMap)");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpieza de búfer

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la descripción de la tarea: ");
                    String descripcion = scanner.nextLine();

                    // TODO 3: Agregar la descripción al ArrayList usando .add()
                    // listaTareas.add(...);

                    // TODO 4: Guardar la tarea en el HashMap usando .put(clave, valor)
                    // Usar 'contadorID' como clave y 'descripcion' como valor
                    // mapaTareas.put(...);

                    System.out.println("✅ Tarea agregada con éxito con el ID: " + contadorID);
                    contadorID++; // Incrementamos el ID para la siguiente tarea
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE TAREAS (ArrayList) ---");
                    // TODO 5: Validar si 'listaTareas' está vacía usando .isEmpty()
                    if (/* TODO: colocar condición */ false) {
                        System.out.println("No hay tareas registradas en la lista.");
                    } else {
                        // TODO 6: Recorrer 'listaTareas' con un ciclo for-each e imprimir cada tarea
                        /*
                        for (String tarea : listaTareas) {
                            System.out.println("- " + tarea);
                        }
                        */
                    }

                    System.out.println("\n--- DICCIONARIO DE TAREAS (HashMap por ID) ---");
                    // TODO 7: Recorrer el HashMap usando un for-each sobre 'mapaTareas.entrySet()'
                    /*
                    for (Map.Entry<Integer, String> entrada : mapaTareas.entrySet()) {
                        System.out.println("ID " + entrada.getKey() + ": " + entrada.getValue());
                    }
                    */
                    break;

                case 3:
                    System.out.print("Ingresa el ID de la tarea a eliminar: ");
                    int idEliminar = scanner.nextInt();

                    // TODO 8: Verificar si el ID existe en el HashMap usando .containsKey()
                    if (/* TODO: verificar si contiene la clave */ false) {
                        
                        // TODO 9: Obtener el texto de la tarea antes de borrar usando .get()
                        String tareaRemovida = ""; // mapaTareas.get(...);

                        // TODO 10: Eliminar la tarea del HashMap usando .remove(clave)
                        // mapaTareas.remove(...);

                        // TODO 11: Eliminar también la tarea del ArrayList usando .remove(objeto)
                        // listaTareas.remove(...);

                        System.out.println("🗑️ Tarea '" + tareaRemovida + "' eliminada correctamente.");
                    } else {
                        System.out.println("❌ No se encontró ninguna tarea con el ID: " + idEliminar);
                    }
                    break;

                case 4:
                    salir = true;
                    System.out.println("👋 ¡Hasta luego! Buen trabajo organizando tus tareas.");
                    break;

                default:
                    System.out.println("⚠️ Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}
