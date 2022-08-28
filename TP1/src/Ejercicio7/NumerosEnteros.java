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

}
