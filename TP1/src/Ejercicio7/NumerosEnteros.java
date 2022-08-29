package Ejercicio7;

public class NumerosEnteros {
	private int cant;
	private Integer[] datos;
	
	public NumerosEnteros(int i) {
	 cant = 0;
	 datos = new Integer[i];
	}
	
	public int maximo() {
		int cursor = 0;
		int toReturn = 0;
		while(cursor < datos.length && datos[cursor] != null) {
			if (toReturn < datos[cursor])
				toReturn = datos[cursor];
			cursor++;
		}
		return toReturn;
	}
	
	public boolean estaNum(int n) {
		boolean toReturn = false;
		if (cant > 0) {
			toReturn = estaNumRec(n, 0);
		}
		else {
			System.out.println("El arreglo esta vacio");
		}
		return toReturn;
	}
	
	private boolean estaNumRec(int n, int i) {
		boolean toReturn = false;
		if(i<cant) {
			if (n == datos[i]) {
				toReturn = true;
			}
			else {
				estaNumRec(n, i+1);
			}
		}
		return toReturn;
	}
}
