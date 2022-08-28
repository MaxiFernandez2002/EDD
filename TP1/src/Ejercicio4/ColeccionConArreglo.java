package Ejercicio4;

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
	
	public void eliminar (E e){
		
	}
}
