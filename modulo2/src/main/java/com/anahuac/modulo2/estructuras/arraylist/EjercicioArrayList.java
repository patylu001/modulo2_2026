package com.anahuac.modulo2.estructuras.arraylist;

import java.util.ArrayList;

public class EjercicioArrayList {

    
    public static void main(String[] args) {
        //int[] numbers= new int[]
        ArrayList<Integer> num = new ArrayList<Integer>();

        System.out.println("Tamaño antes de agregar elementos:" + num.size());
        //Agregar datos
        num.add(3);
        num.add(200);
        num.add(500);

        for (int i= 0 ; i < num.size(); i++) {
            System.out.println("Num:"+num.get(i));
        }
        System.out.println("----------------");
        //System.out.println("Num indice que no existe:"+num.get(3));

        System.out.println("----------------");
        for (Integer numero : num) {
            System.out.println("Num:"+numero);
        }

        System.out.println("----------------");
        System.out.println("Tamaño antes:" + num.size());
        num.add(500);
        num.add(600);
        num.add(700);
        System.out.println("Tamaño después: " + num.size());

        num.set(0, -1);

        System.out.println("----------------");
        for (Integer numero : num) {
            System.out.println("Num:"+numero);
        }
        System.out.println("----------------");
        num.remove(2);
        System.out.println("Tamaño después de remove: " + num.size());

        System.out.println("----------------");
        for (Integer numero : num) {
            System.out.println("Num:"+numero);
        }

    }
}
