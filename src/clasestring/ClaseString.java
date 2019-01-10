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
        System.out.println("Char asociado ala posición: "+s.charAt(5));
        s.substring(0, 18);
        System.out.println(s.substring(8, 18));
      
    }
    
}
