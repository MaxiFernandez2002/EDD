package Ejercicio4;

import Exceptions.ElementoInvalidoException;

public class ColeccionConArreglo<E> implements Coleccion<E> {
	protected int cant; 	// cantidad de elementos almacenados
	protected E[] datos; 	// arreglo de elementos
	
	
	public ColeccionConArreglo(int n) {
		cant = 0; //Inicializa el conteo de elementos en el arreglo en 0;
		datos = (E[]) new Object[n]; //Para hacer un arreglo con una clase generica es necesario castear el parametro de tipo a un arreglo de Object
	}
	
	public void insertar(E e) {
		datos[cant] = e;
		cant++;
	}
	
	public void eliminar (E e) throws ElementoInvalidoException{
		boolean eliminado = false;
		int cursor = 0;
		if (pertenece(e)) {
			while (cursor <  datos.length && !eliminado) {
				if (e.equals(datos[cursor])) {
					arrastrar(cursor);
					eliminado = true;
					cant--;
				}
				cursor++;
			}
		}
		else {
			throw new ElementoInvalidoException("El elemento no se encuentra en el arreglo");
		}
	}
	
	public int cantidadElementos() {
		return cant;
	}
	
	public boolean pertenece(E e) {
		boolean pertenece = false;
		int cursor = 0;
		while (cursor < datos.length && !pertenece) {
			if (e.equals(datos[cursor])) {
				pertenece = true;
			}
			cursor++;
		}
		return pertenece;
	}
	
	private void arrastrar(int cursor) {
		if(datos[cursor+1] != null) {
			datos[cursor] = datos[cursor+1];
			arrastrar(cursor+1);
		}
		else {
			datos[cursor] = null;
		}
	}
}
