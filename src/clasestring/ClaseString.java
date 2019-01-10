/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasestring;

/**
 *
 * @author jose
 */
public class ClaseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String s = "iesmardealboran.com";
      //Tamaño de la cadena
        System.out.println("Tamaño: "+s.length());
        
      //Obtener el char de una posición concreta
      //Obtener subcadena desde el caracter i hasta el final de la cadena
        System.out.println("Char asociado ala posición: "+s.charAt(5));
        s.substring(0, 18);
        System.out.println(s.substring(8, 18));
        
      //Concatenar cadenas. Equivale al operador +
      String s1="ies";
      String s2="mardealboran.com";
      String nuevo=s1.concat(s2);
        System.out.println("Nuevo : "+nuevo);
        System.out.println("Nuevo2: "+s1+s2);
      
      //Devuelve el índice dentro de la cadena
      //De la primera aparición de la cadena a buscar
      
      int indice = nuevo.indexOf("alboran");
        System.out.println(indice);
      int index = nuevo.indexOf("ran",10);
        System.out.println(index);
        
        //Métodos equals y equalsIgnoreCase
        System.out.println("Igualdad Java y java"+"Java".equals("java"));
        System.out.println("Igualdad Java y java"+"Java".equalsIgnoreCase("java"));
        
    }
    
}
