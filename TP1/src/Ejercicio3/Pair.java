package Ejercicio3;

public class Pair <K, V>{
	
	protected K key;
	protected V value;
	
	public Pair(K k, V v) {
		key = k;
		value = v;
	}
	
	public String toString() {
		return ("(" + key + ", " + value + ")");
	}

}
