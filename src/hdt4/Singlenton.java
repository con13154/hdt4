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
