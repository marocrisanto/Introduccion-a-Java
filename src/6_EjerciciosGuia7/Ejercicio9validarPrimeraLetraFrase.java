package EjerciciosGuia7;

import java.util.Scanner;

public class Ejercicio9validarPrimeraLetraFrase {
/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
*/
    public static void main (String[]args){
    //Creamos las variables
    String frase;
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Solicitamos al usuario que ingrese el numero
    System.out.println("Ingrese una frase)");
    //Guardamos el dato en la variable
    frase = leer.nextLine();
    //Cerramos el objeto Scanner
    leer.close();
    //Llamamos a la funcion  
    validarLongitud(frase);
 }
//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static void validarLongitud(String frase) {        
        // Función para validar la longitud de una frase o palabra
        if (frase.substring(0, 1).equals("a")||frase.substring(0, 1).equals("A") ) {
            //frase.length() > 0 se utiliza para evitar una excepción en caso de que la frase esté vacía.
            //por tanto podria quedar asi el if
            //if (frase.length() > 0 && frase.substring(0, 1).equals("a"))||frase.substring(0, 1).equals("A")
            System.out.println("Correcto");
        } else{ 
            System.out.println("Incorrecto");
        }
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
   }
}