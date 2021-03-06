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
        System.out.println("Tamaño: " + s.length());

        //Obtener el char de una posición concreta
        //Obtener subcadena desde el caracter i hasta el final de la cadena
        System.out.println("Char asociado ala posición: " + s.charAt(5));
        s.substring(0, 18);
        System.out.println(s.substring(8, 18));

        //Concatenar cadenas. Equivale al operador +
        String s1 = "ies";
        String s2 = "mardealboran.com";
        String nuevo = s1.concat(s2);
        System.out.println("Nuevo : " + nuevo);
        System.out.println("Nuevo2: " + s1 + s2);

        //Devuelve el índice dentro de la cadena
        //De la primera aparición de la cadena a buscar
        int indice = nuevo.indexOf("alboran");
        System.out.println(indice);
        int index = nuevo.indexOf("ran", 10);
        System.out.println(index);

        //Métodos equals y equalsIgnoreCase
        System.out.println("Igualdad Java y java" + "Java".equals("java"));
        System.out.println("Igualdad Java y java" + "Java".equalsIgnoreCase("java"));

        //Comparación de cadenas (diccionario) Método compareTo()
        //Devuelve cero si las cadenas son iguales
        //Un negativo si s1 está antes de s2 en el diccionario ( menor)
        //O un positivo si s1 está después de s2(mayor)
        int compareTo = s1.compareTo("aes");
        System.out.println("Comparación de s1 y aes: " + compareTo);
        compareTo = "aes".compareTo(s1);
        System.out.println("Comparación entre aes e ies" + compareTo);

        //Conversión mayúsculas y minúsculas
        System.out.println("S2 en mayúsculas: " + s2.toUpperCase());
        System.out.println("S2 en minúsculas: " + s2.toLowerCase());

        //Tamaño de espacios
        String espacios = " palabra palabra ";
        System.out.println("Tamaño de espacios: " + espacios.length());

        String sinEspacios = espacios.trim();
        System.out.println(espacios);
        System.out.println(sinEspacios);

        //Remplazo de caracteres
        System.out.println("String original : ".replace("Str", "P"));

        //Contenido
        String aBuscar = "dealbo";
        System.out.println("¿Contiene " + s2 + " la subcadena " + aBuscar + "? " + s2.contains(aBuscar));

        //Obtener un array de char de una cadena
        //Declaración de una variable array de tipo char
        char[] arrayChar;
        arrayChar = s2.toCharArray();

        //para recorrer un array:
        //length como atributo existe en todos los arrays, equivale al método legnth()
        //Para acceder a cada posición del array uso los corchetes
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.println("Posición i= " + i + " contenido = " + arrayChar[i]);
        }
        //Probar métodos endsWith, startsWith, isEmpty
        
        String cadena = "Mi compañero es un inútil";
        boolean terminar = cadena.endsWith("inútil");//Para saber por qué termina
        
        boolean empezar = cadena.startsWith("Mi");//Para saber por que empieza
        
        boolean vacio = cadena.isEmpty();//Saber si está vacio

    }

}
