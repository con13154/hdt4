/*
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 4
 * Isa Contreras 13154 / Erick de Mata 13648
 * AbstractList.java
*   Clase abstracta que manejas la listas
 */

//package hdt4;

/**
 *
 * @author E. de Mata
 */
public abstract class AbstractList<E> implements List<E> {
    public AbstractList()
   // post: does nothing
   {
   }

   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  
  public boolean contains(E value)
  // pre: value is not null
  // post: returns true iff list contains an object equal to value
  {
	return -1 != indexOf(value);
  }
}
