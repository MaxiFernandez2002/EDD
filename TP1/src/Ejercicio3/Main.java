package Ejercicio3;

public class Main {

	public static void main(String[] args) {
		Pair<Integer, String> par = new Pair<Integer,String>(23, "Juan"); //Usar clases wrapper en los parametros de tipo
		Pair<Float, Integer> par2 = new Pair<Float, Integer>(23.3f, 21345);
		
		System.out.println(par.toString());
		System.out.println(par2.toString());
	}

}
