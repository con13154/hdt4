/*
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 4
 * Isa Contreras 13154 / Erick de Mata 13648
 * StackFactory.java
 */

//package hdt4;

/**
 *StackFactory
 * @author E. de Mata
 */
public class StackFactory<E> {
    public Stack<E> getStack(String entry) {
    if(entry.equals("1"))
        return new StackArrayList<E>();
    if(entry.equals("2"))
        return new StackVector<E>();
    if(entry.equals("3"))
        return new StackList<E>();
    else 
        return null;
    }
}
