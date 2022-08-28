package TDAConjunto;

import Exceptions.ConjuntoVacioException;

public class ConjuntoArreglo <E> implements Conjunto{

	protected E[] s;

	
	public ConjuntoArreglo (int max){
		s = (E[]) new Object[max]; 
	}
	
	
	@Override
	public int size() {
		int cursor = 0;
		int tamanio = 0;
		while (cursor < s.length && s[cursor]!= null) {
			tamanio++;
			cursor++;
		}
		return tamanio;
	}

	@Override
	public int capacity() {
		return s.length;
	}

	@Override
	public boolean isEmpty() {
		return s[0] == null;
	}

	@Override
	public Object get(int i) throws ConjuntoVacioException {
		Object toReturn;
		if(s.length != 0) {
			toReturn = s[i];
		}
		else
			throw new ConjuntoVacioException("EL conjunto esta vacio.");
		return toReturn;
	}

	@Override
	public void put(Object elem) {
		int cursor = 0;
		int tamanio = 0;
		while (cursor < s.length && s[cursor]!= null) {
			tamanio++;
			cursor++;
		}
		s[tamanio] = (E) elem; // Es necesario castear
		
	}

	@Override
	public boolean pertenece(Object elem) {
		int cursor = 0;
		boolean esta = false;
		while (cursor < s.length && s[cursor]!= null && !esta) {
			if ( s[cursor].equals(elem))
				esta = true;
			cursor++;
		}
		return esta;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Conjunto intersection(Conjunto c) {
		int tamanio;
		if (size() < c.size())
			tamanio = size();
		else
			tamanio = c.size();
		Conjunto toReturn = new ConjuntoArreglo<E>(tamanio);
		
		int cursor = 0;
		while (cursor < s.length && s[cursor]!= null) {
			if (c.pertenece(s[cursor])){
					toReturn.put(s[cursor]);
			}
			cursor++;
		}
		
		return toReturn;

	}
	

}
