package com.anahuac.modulo2.interfases;

public class GastoNoFacturable extends Gasto {

	public GastoNoFacturable(double monto, String categoria, String fecha, String tipoPago) {
		super(monto, categoria, fecha, tipoPago);
		// TODO Auto-generated constructor stub
	}


	public void parcializarAMeses(int meses) {
		 System.out.println("Parcializando sin intereses a " + meses + " meses");		
	}

}
