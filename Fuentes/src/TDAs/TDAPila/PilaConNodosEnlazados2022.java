package PROYECTOEDD2022.TDAs.TDAPila;

import PROYECTOEDD2022.Exceptions.EmptyStackException;

/**
 * Implementa los datos y operaciones aplicables sobre una pila simplemente enlazada 
 * @author Arroyo Tomas (126078) - Alconcher Julian (126094)
 * @version 1.0
 * @param <E> El tipo de elemento que va a ser almacenado en la pila
 */
public class PilaConNodosEnlazados2022<E> implements Stack<E>{
	private Nodo<E> head;
	private int tamanio;
	
	/**
	 * Constructor de la pila, inicializa la pila vacia.
	 */
	public PilaConNodosEnlazados2022() {
		head = null;
		tamanio = 0;
	}
	@Override
	public int size() {
		return tamanio;
	}

	@Override
	public boolean isEmpty() {
		return tamanio == 0;
	}

	@Override
	public E top() throws EmptyStackException {
		if(tamanio==0)
			throw new EmptyStackException("TOP :: La pila esta vacia");
		return head.getElemento();
	}

	@Override
	public void push(E element) {
		Nodo<E> nuevo = new Nodo<E>(element);
		nuevo.setSiguiente(head);
		head = nuevo;
		tamanio++;
		
	}

	@Override
	public E pop() throws EmptyStackException {
		if(tamanio==0)
			throw new EmptyStackException("POP:: La pila es vacia");
		E aux = head.getElemento();
		head = head.getSiguiente();
		tamanio--;
		return aux;
	}

}
