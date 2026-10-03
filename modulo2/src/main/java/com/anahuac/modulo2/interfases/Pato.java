package com.anahuac.modulo2.interfases;

public abstract class Pato {
	
	//Atributos o variables de instancia
	private String nombre;
	private String color;
	
	
	public Pato(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	//Métodos
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void flotar() {
		System.out.println("Soy un pato y floto");
	}
	
	public void comer() {
		System.out.println("Soy un pato y estoy comiendo");
	}
	
	public void volar() {
		System.out.println("Soy un pato y estoy volando");
	}
	
	abstract public void quack();

	
}
