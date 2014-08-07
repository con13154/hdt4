/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hdt4;

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
