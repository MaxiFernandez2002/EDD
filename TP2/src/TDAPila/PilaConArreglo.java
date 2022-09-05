package TDAPila;

import Exceptions.EmptyStackException;

public class PilaConArreglo <E> implements Stack<E>{
	
	private int size;
	private E[] datos;
	
	public PilaConArreglo (int max){
		datos = (E[]) new Object[max];
		size = 0;
	}
	
	public PilaConArreglo () {
		this(20);
	}
	
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public E top() throws EmptyStackException {
		if (size == 0)
			throw new EmptyStackException("La pila se encuentra vacia");
		else
			return datos[size-1];
	}

	@Override
	public void push(E element) {
		datos[size] = element;
		size++;
	}

	@Override
	public E pop() throws EmptyStackException {
		size--;
		E toReturn = datos[size];
		datos[size] = null;
		return toReturn;
	}
}

	

