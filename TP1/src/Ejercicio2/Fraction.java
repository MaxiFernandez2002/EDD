package Ejercicio2;

import Exceptions.FractionException;

public class Fraction {
	protected int numerador;
	protected int denominador;
	
	public Fraction (int n, int d) throws FractionException{
		if (d != 0)
		{
			numerador = n;
			denominador = d;
		}
		else
			throw new FractionException("El denominador ingresado no puede ser 0");
	}
	
	public String toString() {
		return (numerador + "/" + denominador);
	}
	
}
