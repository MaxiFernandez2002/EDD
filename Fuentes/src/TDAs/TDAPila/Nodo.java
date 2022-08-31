 package PROYECTOEDD2022.TDAs.TDAPila;

 /**
  * Implementa los metodos de la clase Nodo:
  * @author Arroyo Tomas (126078) - Alconcher Julian (126094)
  * @version 1.0
  * @param <E> Tipo de dato de los elementos a almacenar en el nodo.
  */
public class Nodo<E> 
{
	private E elemento;
	private Nodo<E> siguiente;
	
	
	/**
	 * Constructor 1 que inicializa los parametros con los valores pasadados por parametro
	 * @param item
	 * @param sig
	 */
	public Nodo( E item, Nodo<E> sig )
	{ 
		elemento=item; 
		siguiente=sig; 
    }
	/**
	 * Constructor 2 que inicializa por defecto al siguiente en nulo
	 * @param item
	 */
	public Nodo( E item )
	{ 
		this(item,null); 
	}
	
	/**
	 * Setea el elemento
	 * @param elemento
	 */
	public void setElemento( E elemento )
	{ 
		this.elemento = elemento; 
	}
	/**
	 * Setea el siguiente 
	 * @param siguiente es el nodo siguiente a insertar
	 */
	public void setSiguiente( Nodo<E> siguiente )
	{ 
		this.siguiente = siguiente; 
	}
	
	/**
	 * Consulta que retorna el elemento.
	 * @return el parametro elemento
	 */
	public E getElemento() 
	{ 
		return elemento; 
	}
	/**
	 * Consulta que retorna el siguiente.
	 * @return el siguiente
	 */
	public Nodo<E> getSiguiente() 
	{ 
		return siguiente; 
	}
	
}
