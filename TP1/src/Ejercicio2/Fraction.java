package Ejercicio2;

import Exceptions.FractionException;

public class Fraction {
	protected int numerador; //Numerador de la fraccion
	protected int denominador; //Denominador de la fraccion
	
	
	// Constructor de la clase fraccion, el ptimer entero representa el numerador y el segundo denominador
	public Fraction (int n, int d) throws FractionException{ 
		if (d != 0)
		{
			numerador = n;
			denominador = d;
		}
		else
			throw new FractionException("El denominador ingresado no puede ser 0");
	}
	
	//Expresa la fraccion como una string
	public String toString() {
		return (numerador + "/" + denominador);
	}
	
}
