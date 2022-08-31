package PROYECTOEDD2022.Programa;

/**
 * Clase Pair
 * @author Arroyo Tomas (126078) - Alconcher Julian (126094)
 * @param <C>
 * @param <I>
 * @version 1.0
 */

public class Pair<C,I> {

	protected C tag;

	protected I grade;
	
	/**
	 * Constructor de la clase pair.
	 * @param c
	 */
	public Pair(C c) {
		tag = c;
	}
	/**
	 * Retorna el rotulo del nodo.
	 * @return rotulo del par
	 */
	public C getTag() {
		return tag;
	}
	/**
	 * Retorna el grado del nodo.
	 * @return grado del par
	 */
	public I getGrade() {
		return grade;
	}
	/**
	 * Setea el parametro "c" a tag.
	 * @param c rotulo a setear
	 */
	public void setTag(C c) {
		tag = c;
	}
	/**
	 * Setea el parametro i a grade
	 * @param i grado a setear
	 */
    public void setGrade(I i) {
    	grade = i;
    }
	/**
	 * Retorna un string con el formato: " (tag,grade) "
	 * @return un string con el rotulo y el grado del elemento en cuestion
	 */
	public String toStringPair()
	{
		return "(" + tag + " , " + grade + ")";
	}
	
}
