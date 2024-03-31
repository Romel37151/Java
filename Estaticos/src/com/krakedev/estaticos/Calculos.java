package com.krakedev.estaticos;

public class Calculos {
	private final double IVA = 12;//hase q el valor no se pueda cambiar y se comvierte en una constatnte 
	// las constantes se escriben todo en mayusculas 
public double calcularIva(double monto) {
	return monto*IVA/100;
	
}
}
