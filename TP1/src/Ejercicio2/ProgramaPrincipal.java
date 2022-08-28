package Ejercicio2;

import java.util.Scanner;

import Exceptions.FractionException;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		try {
			System.out.println("Ingrese el valor para el numerador");
			Scanner num = new Scanner(System.in);
			System.out.println("Ingrese el valor para el denominador");
			Scanner den = new Scanner(System.in);
			int intNum = num.nextInt();
			int intDen= num.nextInt();
			
			Fraction f = new Fraction(intNum, intDen);
			
			System.out.println("La fraccion ingresada es: " + f.toString());
		}
		catch(FractionException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
