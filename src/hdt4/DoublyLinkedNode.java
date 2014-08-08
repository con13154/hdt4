/*
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 4
 * Isa Contreras 13154 / Erick de Mata 13648
 * DublyLinkedNode.java
*Nodo utilizado para el funcionamiento correcto de la lista encadenada doble
 */

//package hdt4;

/**
 *
 * @author E. de Mata
 */
public class DoublyLinkedNode<E> {
protected E data;
protected DoublyLinkedNode<E> nextElement;
protected DoublyLinkedNode<E> previousElement;

public DoublyLinkedNode(E v,
    DoublyLinkedNode<E> next,
    DoublyLinkedNode<E> previous)
{
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}

    public DoublyLinkedNode(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }

    void setNext(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    
    public DoublyLinkedNode<E> previous()
    {
        return previousElement;
    }
    
    public E value()
    {
        return data;
    }
}
