/*
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 4
 * Isa Contreras 13154 / Erick de Mata 13648
 * Singlenton.java
*Patron Singlenton, utilizado para determinar que solamente se esta instanciando una vez un objeto
 */

//package hdt4;

/**
 *
 * @author E. de Mata
 */
public class Singlenton {
    protected Singlenton() {
      // Exists only to defeat instantiation.
   }
    private static Singlenton instance = null;
     public static Singlenton getInstance() {
      if(instance == null) {
         instance = new Singlenton();
      }
      return instance;
   }
}
