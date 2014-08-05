/*
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 4
 * Isa Contreras 13154 / Erick de Mata 13648
 * AbstractStack.java
 */

package hdt4;

abstract public class AbstractStack<E> implements Stack<E>
{
      public boolean empty()
   // post: regresa true si el stack esta vacio
   {
      return size() == 0;
   }
}
