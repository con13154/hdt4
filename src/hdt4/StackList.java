/*
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 4
 * Isa Contreras 13154 / Erick de Mata 13648
 * StackList.java
 */

//package hdt4;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author E. de Mata
 */
public class StackList<E> extends AbstractStack<E>{
    public ListFactory factorList = new ListFactory();
    protected List<E> data = (List<E>) factorList.getList(parametro());
    String opcion; 

	public String parametro()
	// post: constructs a new, empty stack
	{
		//Aca se pone que parametro se quiere encontrar 
            opcion = JOptionPane.showInputDialog("Elegir lista a utilizar: \n1) lista circular.\n2) lista simple.\n3) lista doble",opcion);
            return opcion;
	}

	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
}
