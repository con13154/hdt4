/*
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 4
 * Isa Contreras 13154 / Erick de Mata 13648
 * StackListTest.java
*Prueba Unitaria
 */

//package hdt4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isa
 */
public class StackListTest {
    
    public StackListTest() {
    }
  
    
    
    @Test
    public void testSize() {
        System.out.println("JUnit Tamaño StackList");
       StackList prueba = new StackList();
        //Ingresa 4 datos a la pila y espera que el metodo lo cuente y regrese el valor 4
        int esperado =3;
        String dato ="U";
        prueba.push(dato);
        dato = "V";
        prueba.push(dato);
        dato = "G";
        prueba.push(dato);
        int resultado = prueba.size();
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testEmpty() {
         System.out.println("JUnit StackList Vacia");
        StackList prueba = new StackList();
        //Espera que se cumpla con la condicion que la pila este vacia y devuelva true
        boolean esperado = true;
        boolean resultado = prueba.empty();
        assertEquals(esperado, resultado);
    }
    
}
