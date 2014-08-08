
/*
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 4
 * Isa Contreras 13154 / Erick de Mata 13648
 * StackArrayListText.java
*PruebaUnitaria
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
public class StackArrayListTest {
    
    public StackArrayListTest() {
    }
    
    
    @Test
    public void testPop() {
         System.out.println("JUnit Pop ArrayList");
        StackArrayList prueba = new StackArrayList();
        //Ingresa 4 datos a la pila y espera que el ultimo dato ingresado sea igual al primer dato que se saca
        String dato ="E";
        prueba.push(dato);
        dato = "r";
        prueba.push(dato);
        dato = "i";
        prueba.push(dato);
        dato = "c";
        prueba.push(dato);
        dato = "k";
        prueba.push(dato);
        Object resultado = prueba.pop();
        assertEquals(dato, resultado);
    }

    @Test
    public void testPeek() {
         System.out.println("JUnit Peek ArrayList");
          StackArrayList prueba = new StackArrayList();
        //Ingresa un dato y espera que el metodo peek indique que ese mismo dato se encuentra en la pila sin sacarlo
        String esperado = "1";
        prueba.push(esperado);
        //Object expResult = null;
        Object resultado = prueba.peek();
        assertEquals(esperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSize() {
       System.out.println("JUnit Tamaño ArrayList");
       StackArrayList prueba = new StackArrayList();
        //Ingresa 4 datos a la pila y espera que el metodo lo cuente y regrese el valor 4
        int esperado =3;
        String dato ="I";
        prueba.push(dato);
        dato = "S";
        prueba.push(dato);
        dato = "A";
        prueba.push(dato);
        int resultado = prueba.size();
        assertEquals(esperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEmpty() {
         System.out.println("JUnit ArrayList Vacia");
        StackArrayList prueba = new StackArrayList();
        //Espera que se cumpla con la condicion que la pila este vacia y devuelva true
        boolean esperado = true;
        boolean resultado = prueba.empty();
        assertEquals(esperado, resultado);
    }
    
}
