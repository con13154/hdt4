/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hdt4;

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
