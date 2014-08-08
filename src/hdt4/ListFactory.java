/*
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 4
 * Isa Contreras 13154 / Erick de Mata 13648
 * ListFactory.java
*Segundo Factory utilizado para decidir cual de las listas (encadenada, doblemente encadenada o circular) se utilizara
 */

//package hdt4;

/**
 *
 * @author E. de Mata
 */
public class ListFactory<E> {
    public List<E> getList(String entry){
        if(entry.equals("1"))
            return new SinglyLinkedList<E>();
        if(entry.equals("2"))
            return new DoubleLinkedList<E>();
        if(entry.equals("3"))
            return new CircularList<E>();
        else 
            return null;
    
    }
}
