package Ejercicio4;

import Exceptions.ElementoInvalidoException;

public interface Coleccion <E>{
	public void insertar(E e);
	public void eliminar (E e) throws ElementoInvalidoException;
	public int cantidadElementos();
	public boolean pertenece(E e);

}
