package PROYECTOEDD2022.TDAs.TDAArbol;

import PROYECTOEDD2022.TDAs.TDALista.*;

/**
 * TNODO 
 * @author Arroyo Tomas (126078) - Alconcher Julian (126094)
 * @param <E> Tipo de dato de los elementos a almacenar en el nodo.
 * @version 1.0
 */

public class TNodo<E>  implements Position<E>{

	private E elemento;
	
	private TNodo<E> padre;
	
	private PositionList<TNodo<E>> hijos;
	
	/**
	 * Constructor de la clase TNodo
	 * Crea un nuevo nodo que guarda el elemento pasado por parametro y tiene como padre el nodo pasado por parametro.
	 * @param elemento Es el elemento que va a guardar el nodo.
	 * @param padre Es el nodo que sera enlazado como padre.
	 */
	public TNodo(E elemento, TNodo<E> padre){
		this.elemento = elemento; 
		this.padre= padre;
		hijos = new ListaDoblementeEnlazada2022<TNodo<E>>();
	}
	
	/**
	 * Crea un nuevo nodo que guarda el elemento pasado por parametro y sin padre.
	 * @param elemento Es el elemento que va a guardar el nodo.
	 */
	public TNodo(E elemento){
		this(elemento, null);
	}
	
	/**
	 * Consulta el elemento que guarda el nodo.
	 * @return El elemento que guarda el nodo.
	 */
	public E element(){
		return elemento;
	}
	
	/**
	 * Consulta la lista de hijos que tiene el nodo.
	 * @return La lista de hijos del nodo.
	 */
	public PositionList<TNodo<E>> getHijos(){
		return hijos;
	}
	
	/**
	 * Cambia el elemento que guarda el nodo por el pasado por parametro.
	 * @param elemento Es el nuevo valor que va a tener el nodo en su elemento.
	 */
	public void setElemento(E elemento){
		this.elemento = elemento;
	}
	
	/**
	 * Consulta cual es el padre del nodo.
	 * @return El padre del nodo.
	 */
	public TNodo<E> getPadre(){
		return padre;
	}
	
	/**
	 * Cambia el padre actual del nodo por el nodo pasado por parametro.
	 * @param padre El nuevo padre del nodo.
	 */
	public void setPadre(TNodo<E> padre){
		this.padre = padre;
	}
	
	/**
	 * Retorna un string del elemento
	 * @return string del elemento
	 */
	public String toStringA() {
		return elemento.toString();
	}
	
}