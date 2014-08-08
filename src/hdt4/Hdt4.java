/*
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 4
 * Isa Contreras 13154 / Erick de Mata 13648
 * Hdt4.java
* Clase utilizada para pedir al usuario que tipo de implementacion utilizara
*Tambien es el encargado de realizar la coneccion con el texto que contiene la operacion
 */

//package hdt4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


    public class Hdt4 {
        // TODO code application logic here
        //Stack<String> miStack = new StackVector<String>(); 
        public StackFactory factor = new StackFactory();
        public Stack<String> miStack = factor.getStack(parametro()); 
        
        
        int numero;
        double n1;
        double n2;
        String sCadenaSinBlancos = "";
        String opcion;
        // TODO code application logic here
        //Detección del texto en el que se encuentra la operación
        
     
        public String parametro(){
            opcion = JOptionPane.showInputDialog(".CALCULADORA.\nElegir Almacenamiento a utilizar: \n 1) Array List \n 2) Vector \n 3) Tipo Lista");
            return opcion;
        }
        File f = new File( "src/texto.txt" );
        
        BufferedReader entrada;
        
        public void calculadora4() {
        try {
       
        entrada = new BufferedReader( new FileReader( f ) );
        String linea;
        
        while(entrada.ready()){
            //Detecta lo que se encuentra en la linea leída del archivo.txt
            linea = entrada.readLine();
            System.out.println(linea);
            linea = linea.substring(0);
            System.out.println(linea);
            numero = linea.length(); 
            //Imprime lo que detecta para verificación
            System.out.println(numero); 
            for (int x=0; x < linea.length(); x++) {
                if (linea.charAt(x) != ' '){
                    //Guarda en una cadena la linea del calculo sin espacios
                    sCadenaSinBlancos += linea.charAt(x);
                }
            }
            //Imprime la linea sin espacios para verificación
            System.out.println(sCadenaSinBlancos);
            
            //Evalúa lo que se encuentra dentro de la linea sin espacios hasta que se haya completado el largo
            for(int x=0; x<sCadenaSinBlancos.length(); x++){
                String dato =  Character.toString(sCadenaSinBlancos.charAt(x));
                //Si el caracter no es una operación se guarda el dato
                if( (dato.equals("+") || dato.equals("-") || dato.equals("*") || dato.equals("/")) != true){
                    
                    miStack.push(dato);
                }
                //Si el caracter es una suma saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("+")){
                    n2 = Double.parseDouble(miStack.pop());
                    n1 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 + n2));
                }
                //Si el caracter es una resta saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("-")){
                    n2 = Double.parseDouble(miStack.pop());
                    n1 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 - n2));
                }
                //Si el caracter es una multiplicacion saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("*")){
                    n2 = Double.parseDouble(miStack.pop());
                    n1 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 * n2));
                }
                //Si el caracter es una division saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("/")){
                    n2 = Double.parseDouble(miStack.pop());
                    n1 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 / n2));
                }
                
            }
            //Impresión de resultado
            System.out.println(miStack.pop());
            
        }
        }catch (IOException e) {
        e.printStackTrace();
        }
        }
    }
    
    

